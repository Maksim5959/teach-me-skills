function onChange() {
    const password = document.querySelector('input[name=password]');
    const confirm = document.querySelector('input[name=confirm]');
    if (confirm.value === password.value) {
        confirm.setCustomValidity('');
    } else {
        confirm.setCustomValidity('Passwords do not match');
    }
}
$('body').on('click', '.form-check-input', function(){
    if ($(this).is(':checked')){
        $('#password').attr('type', 'text');
        $('#corePassword').attr('type','text')
    } else {
        $('#password').attr('type', 'password');
        $('#corePassword').attr('type','password')
    }
});