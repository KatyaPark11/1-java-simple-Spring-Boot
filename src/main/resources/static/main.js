window.onload = function() {
   $(".like").click((e) => {
      var btn = $(e.currentTarget);
      var postId = btn.attr("data-post-id");
      btn.attr("disabled", "disabled");
      $.post("post/" + postId + "/like", (data) => {
         btn.text("" + data + " ❤");
         btn.addClass("btn-danger");
         btn.removeClass("btn-secondary");
      });
   });
};