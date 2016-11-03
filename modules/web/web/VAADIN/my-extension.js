window.com_company_demo_web_ext_MyExtension = function() {
  var self = this;

  self.init = function (inputId) {
    $('#' + inputId).on('input', function() {
      window.alert('Changed!');
    });
  }
}