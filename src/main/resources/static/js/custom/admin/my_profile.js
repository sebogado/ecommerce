$(document).ready(() = > {
    $("#username"
).
on("change paste", () = > {
    $.ajax({
        url: "/myProfile/checkUsernameAvailable?username=" + $("#username").val(),
        success: availableUsername(true),
        error: availableUsername(false)
    });
})
;
})
;


function availableUsername(condition) {
    $('#savePerfil').prop('disable', !condition);
    $('#isAvailable').prop('visible', condition);
    $('#isNotAvailable').prop('visible', !condition);
}
