$(document).ready(function (){
    $('#routs a').click(function (){
        var url=$(this).attr('href');
        $('#contenido').load(url);
        return false;   
    });

})