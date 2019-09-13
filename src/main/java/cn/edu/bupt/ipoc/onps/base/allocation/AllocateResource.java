package cn.edu.bupt.ipoc.onps.base.allocation;

import cn.edu.bupt.ipoc.onps.model.entity.Resource;

public interface AllocateResource {
    Resource launch(Resource resource, String pattern);
}
