 /*$(function () {
         $('#datepicker').datetimepicker({
             language: 'en',
             pickDate: false
         });
     });*/
 $(document).ready(function () {
     $('#datepicker1').datetimepicker({
         language: 'en',
         format: 'dd/mm/yyyy',
         pickDate: false,
         autoclose: true
     });
 });