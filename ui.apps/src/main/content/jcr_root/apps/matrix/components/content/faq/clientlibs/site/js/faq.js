(function(){

    $('.ques-icon').click(function(){
        if($(this).hasClass('active')){
            $(this).removeClass('active');            
            $(this).parents('.accordion-item').find('.acc-ans').removeClass('active');
            $(this).parent('.acc-ques').removeClass('active');
        }
        else{
            $('.ques-icon').removeClass('active');
            $(this).addClass('active');
            $('.acc-ques').removeClass('active');
            $(this).parent('.acc-ques').addClass('active');
            $('.acc-ans').removeClass('active');
            $(this).parents('.accordion-item').find('.acc-ans').addClass('active');
        }
    })

})();