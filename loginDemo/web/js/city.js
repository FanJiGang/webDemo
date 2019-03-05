function getCities() {
    var pid=$(this).val();
    $.post("getCities","pid="+pid,function (data,status) {
        var options="";
        $.each($(data).find("city"),function (index,domEle) {
            options+="<option>"+$(this).children("cname").text()+"</option>";
        });
        $("#city").empty();
        $("#city").append($("<option>-请选择-</option>"));
        $("#city").append($(options));
    });
}
function getCities02() {
    var pid=$(this).val();
    $.post("getCities02","pid="+pid,function (data,status) {
        /*var arr=JSON.parse(data);
        for (var i = 0; i < arr.length; i++) {
            alert(arr[i].cname);
        }*/
        $("#city").html("<option>-请选择-</option>")
        $(data).each(function (index, city) {
            $("#city").append("<option id='"+city.cid+"'>"+city.cname+"</option>");
        });
    },"json");
}