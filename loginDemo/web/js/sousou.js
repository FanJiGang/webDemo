function moreWords() {
    $("#msg").load("checkWord","word="+$(this).val(),function (data, status) {
        if($("#msg").text().trim()==""){
            $("#msg").hide();
        }else{
            $("#msg").show();
        }
    });
}