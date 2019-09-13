$(window).load(function(){
	$('.file_name').html('');

	$('.close').click(function(){
		$('.upload_div').fadeOut(300);
	});

	$('.select').change(function(){
		var filePath = $(this).val();
		var fileArr = filePath.split('\\');
		console.log(fileArr);
		$('.file_name').html(fileArr[fileArr.length-1]).show();
		console.log(filePath);
	});

	$('.selectBtn').on('click',function(e){
		$('.select').trigger('click');
		e.preventDefault();
	});
});