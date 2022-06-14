$(function() {
    //hang on event of form with id=myform
    $("#enquiryformId form").submit(function(e) {
        //prevent Default functionality
        e.preventDefault();
		console.log($("#enquiryformId form").serialize());
        //do your own request an handle the results
        $.ajax({
                url: '/bin/matrix/enquiry',
                type: 'get',
                dataType: 'html',
                data: $("#enquiryformId form").serialize(),
                success: function(data) {
					var result = data;
            		$('#enquiryformId .form-response').html(result);
                    setTimeout(function(){
                        $('#enquiryformId .form-response').empty();
                    }, 5000);
                }
        });

    });

});