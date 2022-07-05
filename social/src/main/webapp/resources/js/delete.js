function test(e) {
    if(confirm('Are you sure you want to delete your account?')){
        return true;
    }else{
        e.preventDefault();
    }
}