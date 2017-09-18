<%-- 
    Document   : footer
    Created on : Sep 12, 2017, 12:11:51 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 2.4.0
        </div>
        <strong>Copyright © 2014-2016 <a href="https://adminlte.io">Almsaeed Studio</a>.</strong> All rights
        reserved.
    </footer>
</div>
<script src="${pageContext.request.contextPath}/admin/js/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="js/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="${pageContext.request.contextPath}/admin/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="${pageContext.request.contextPath}/admin/js/raphael.min.js"></script>
<script src="${pageContext.request.contextPath}/admin/js/morris.min.js"></script>
<!-- daterangepicker -->
<script src="${pageContext.request.contextPath}/admin/js/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/admin/js/daterangepicker.js"></script>
<!-- datepicker -->
<script src="${pageContext.request.contextPath}/admin/js/bootstrap-datepicker.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${pageContext.request.contextPath}/admin/js/bootstrap3-wysihtml5.all.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/admin/js/adminlte.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pageContext.request.contextPath}/admin/js/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/admin/js/demo.js"></script>
<div class="daterangepicker dropdown-menu ltr opensleft">
    <div class="calendar left">
        <div class="daterangepicker_input"><input class="input-mini form-control" type="text"
                                                  name="daterangepicker_start" value=""><i
                    class="fa fa-calendar glyphicon glyphicon-calendar"></i>
            <div class="calendar-time" style="display: none;">
                <div></div>
                <i class="fa fa-clock-o glyphicon glyphicon-time"></i></div>
        </div>
        <div class="calendar-table"></div>
    </div>
    <div class="calendar right">
        <div class="daterangepicker_input"><input class="input-mini form-control" type="text" name="daterangepicker_end"
                                                  value=""><i class="fa fa-calendar glyphicon glyphicon-calendar"></i>
            <div class="calendar-time" style="display: none;">
                <div></div>
                <i class="fa fa-clock-o glyphicon glyphicon-time"></i></div>
        </div>
        <div class="calendar-table"></div>
    </div>
    <div class="ranges">
        <ul>
            <li data-range-key="Today">Today</li>
            <li data-range-key="Yesterday">Yesterday</li>
            <li data-range-key="Last 7 Days">Last 7 Days</li>
            <li data-range-key="Last 30 Days">Last 30 Days</li>
            <li data-range-key="This Month">This Month</li>
            <li data-range-key="Last Month">Last Month</li>
            <li data-range-key="Custom Range">Custom Range</li>
        </ul>
        <div class="range_inputs">
            <button class="applyBtn btn btn-sm btn-success" disabled="disabled" type="button">Apply</button>
            <button class="cancelBtn btn btn-sm btn-default" type="button">Cancel</button>
        </div>
    </div>
</div>

</body>
</html>
