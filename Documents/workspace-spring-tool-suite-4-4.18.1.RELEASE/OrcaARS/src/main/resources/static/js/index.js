 //네비게이션 서브 메뉴 기능
 
 		$(function(){
            $(".nav-main_wrap li").hover(function(){
                $("ul:first",this).show();
            }, function(){
                $("ul:first",this).hide();
            });
            $(".nav-main_wrap>li:has(ul)>a").each(function(){
                $(this).html($(this).html()+' &or;');
            });
            $(".nav-main_wrap ul li:has(ul)").find("a:first").append("<p style='float:right;margin:-3px'>&#9656;</p>");
        })

         