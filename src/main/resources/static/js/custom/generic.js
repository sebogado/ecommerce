/**
 * Created by sbogado on 26/05/17.
 */
$(document).ready(() = > {
    if($("#logo-complete").length
)
{
    adjuntarEventoLogo();
}
})
;

function adjuntarEventoLogo() {
    if ($(window).width() < 500) {
        $('#logo-abrev').show();
        $('#logo-complete').hide();
    } else {
        $('#logo-complete').show();
        $('#logo-abrev').hide();
    }
    $(window).resize(function () {
        if ($(window).width() < 500) {
            $('#logo-abrev').show();
            $('#logo-complete').hide();
        } else {
            $('#logo-complete').show();
            $('#logo-abrev').hide();
        }
    });
}
