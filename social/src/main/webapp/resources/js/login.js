$('body').on('click', '.form-check-input', function(){
    if ($(this).is(':checked')){
        $('#password').attr('type', 'text');
    } else {
        $('#password').attr('type', 'password');
    }
});