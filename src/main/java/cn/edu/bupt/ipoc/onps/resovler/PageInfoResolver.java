package cn.edu.bupt.ipoc.onps.resovler;

import cn.edu.bupt.ipoc.onps.base.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageInfoResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        /**
         * 判断接口上边是否为PageInfo的参数
         */
        return methodParameter.getParameterType().isAssignableFrom(PageInfo.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {


        /**
         * 返回的参数
         */
        PageInfo pageInfo = new PageInfo();

        /**
         *  获取到本地的操作
         */
        HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        HttpServletResponse response = nativeWebRequest.getNativeResponse(HttpServletResponse.class);

        try {

            /**
             * 页面大小
             */
            int pageSize;


            if (StringUtils.isEmpty(request.getParameter("pageSize"))) {
                pageSize = 10;
            } else {
                pageSize = Integer.valueOf(request.getParameter("pageSize"));
            }


            /**
             * 获取到当前页
             */
            int currentPage = 0;


            if (StringUtils.isEmpty(request.getParameter("currentPage"))) {
                /**
                 * 默认第一页
                 */
                currentPage = 1;
            } else {
                currentPage = Integer.valueOf(request.getParameter("currentPage"));
            }

            int prePage = currentPage == 1 ? 1 : currentPage - 1;

            /**
             * nextPage在查询数据的时候在进行赋值
             */

            pageInfo.setCurrentPage(currentPage);
            pageInfo.setPageSize(pageSize);
            pageInfo.setPrePage(prePage);
            pageInfo.setStatus(PageInfo.SUCCESS_STATUS);
            pageInfo.setStatusMessage("读取数据成功");

            return pageInfo;


        } catch (Exception e) {

            pageInfo.setStatus(PageInfo.FAIL_STATUS);
            pageInfo.setStatusMessage(e.getMessage());

            return pageInfo;
        }

    }
}
