/**
 * Created by sbogado on 6/15/17.
 */

function agregarComponente() {
    var newTr = $("#tableComponentes tr:first-child").clone();
    //Change Index and reset inputs
    $(".input-porcentaje", newTr).val("0");
    $(".idTallaArt", newTr).val(null);

    //Append new element
    $("#tableComponentes tbody").append(newTr);
}


function eliminarComponente(element) {
    $(element).closest("#tableComponentes tr").remove();
}

function sendForm() {
    //Check Combos

    //Re-index components
    /*  $("#tableComponentes tr").each( function( index ) {
          console.log("index: " + this);
          $(".select-talle", this).attr("name", "talleArticulo[" + index + "].talle.id");
          $(".idTallaArt", this).attr("name", "talleArticulo[" + index + "].id");
          $(".input-cantidad", this).attr("name", "talleArticulo[" + index + "].cantidad");
      });*/
    $("#alta-form").submit();
}
