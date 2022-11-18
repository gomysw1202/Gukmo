<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String ctxPath = request.getContextPath();
%>

  <%-- 직접 만든 CSS --%>
  <link rel="stylesheet" type="text/css" href="<%=ctxPath%>/resources/css/hyunwoo/activities.css" />
  
  <%-- 직접만든 javascript --%>
  <script type="text/javascript" src="<%=ctxPath %>/resources/js/hyunwoo/activities.js" ></script>


  <div class="container my-4">
  	<%-------------------- 사이드바 시작 ----------------------%>
        
    <%-- sidebar 호출 --%>
	<jsp:include page="/WEB-INF/views/tiles1/member/sidebar.jsp" />
        
        
    <%-------------------- 사이드바 끝 ----------------------%>
    
    <div id="main">
      <%-- main_header --%>
      <div class="main_header border rounded">
        <%-- top --%>
        <div class="d-flex">
          <div class="d-flex w-100 justify-content-between py-4 px-3 align-items-center">
            <div class="d-flex align-items-center">
              <%-- 프사 --%>
              <div id="profile_img_box" class="border">
                <img src="<%=ctxPath %>/resources/images/${sessionScope.user.profile_image}"/>
              </div>
      
              <div class="ml-4 py-1">
                <h4 id="user_nickname">${sessionScope.user.nickname}</h4>
                <div id="point">활동점수&nbsp;<span>${sessionScope.user.point}</span></div>
              </div>
            </div>
  
            <button type="button" id="btn_go_myId" class="btn border rounded">
              	나의 계정
            </button>
          </div>
        </div>

        <%-- bottom --%>
        <div id="navbar" class="d-flex justify-content-center border-top">
          <div class="filter mx-4 py-3">
            	활동내역
          </div>
          <div class="filter mx-4 py-3">
            	게시물
          </div>
        </div>
      </div>


      <%-- 활동내역 시작 --%>
      <div id="activities" class="mt-4">
        <%-- 1 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
             	스터디
              </div>
              <div class="activity_content ml-2">
               	비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              	2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            	[자바] 이클립스 파일에 있는 화살표
          </div>
        </div>


        <%-- 2 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                공지사항
              </div>
              <div class="activity_content ml-2">
                관리자 님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>


        <%-- 3 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                자유게시판
              </div>
              <div class="activity_content ml-2">
                에 게시글을 작성하였습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>


        <%-- 4 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>


        <%-- 5 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>


        <%-- 6 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>


        <%-- 7 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>

        <%-- 8 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>

        <%-- 9 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>

        <%-- 10 --%>
        <div class="activity_box border-top border-bottom py-4">
          <div class="activity_title align-items-center">
            <div class="d-flex align-items-center">
              <div class="detail_category border rounded-pill px-2 py-2">
                스터디
              </div>
              <div class="activity_content ml-2">
                비전공자모래성님의 게시물에 댓글을 달았습니다.
              </div>
            </div>
            <div class="activity_date">
              2022-11-08 20:14:16
            </div>
          </div>
          <div class="board mt-2">
            [자바] 이클립스 파일에 있는 화살표
          </div>
        </div>
      </div>
    </div>

    <%----------------------------------- main 끝-------------------------------------%>
  </div>


  <%----------------------------------------------------------- 페이지 바 시작 ---------------------------------------------%>
  <nav aria-label="...">
    <ul class="my pagination pagination-md justify-content-center mt-5">
      <%-- 첫페이지로 이동버튼 --%>
      <li class="page-item">
        <a class="page-link" href="#">
          <i class="fa-solid fa-angles-left"></i>
        </a>
      </li>
      
      
      <%-- 전페이지로 이동버튼 --%>
      <li class="page-item">
        <a class="page-link" href="#">
          <i class="fa-solid fa-angle-left"></i>
        </a>
      </li>
      
      <%-- 페이지번호 시작--%>
      <li class="page-item active" aria-current="page">
        <a class="page-link" href="#">1</a>
      
      <li class="page-item">
        <a class="page-link" href="#">2</a>
      </li>

      <li class="page-item">
        <a class="page-link" href="#">3</a>
      </li>

      <li class="page-item">
        <a class="page-link" href="#">4</a>
      </li>

      <li class="page-item">
        <a class="page-link" href="#">5</a>
      </li>
      <%-- 페이지번호 끝 --%>
            
            
            
      <%-- 다음페이지로 이동버튼 --%>
      <li class="page-item">
        <a class="page-link" href="#"><i class="fa-solid fa-angle-right"></i></a>
      </li>

      <%-- 맨 끝페이지로 이동버튼 --%>
      <li class="page-item">
        <a class="page-link" href="#"><i class="fas fa-solid fa-angles-right"></i></a>
      </li>
    </ul>
  </nav>
  <%----------------------------------------------------------- 페이지 바 끝 ---------------------------------------------%>


  <%-- 검색바시작 --%>
  <div id="search_area" class="d-flex mx-auto my-5">
    <div id="academy_search" class="d-flex m-auto rounded">
      <div id="input_keyword">
        <input type="text" id="searchWord" placeholder="활동내역 검색" id="keyword" class="pl-3" name="keyword">
      </div>
      <div id="search_btn">
        <button type="button" class="btn btn-white" id="btn_search"><i class="fas fa-xl fa-thin fa-magnifying-glass"></i></button>
      </div>
    </div>
  </div>
  <%-- 검색바 끝 --%>


</body>
</html>