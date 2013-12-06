<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 13-12-5
  Time: 下午3:31
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.usavich.entity.others.YolandCalc" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.usavich.service.common.def.CommonService" %>

<html>
<head>
    <title></title>
</head>
<body>
<%!
    String getStringfromParam(String[] contents) {
        String returned = "|";
        if (contents != null) {
            for (String content : contents) {
                if (content != null && content != "") {
                    returned = returned + content + "|";
                }
            }
        }
        return returned;
    }
%>
<%
    request.setCharacterEncoding("utf-8");
    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
    CommonService commonService = (CommonService) context.getBean("commonService");
    YolandCalc yolandCalc = new YolandCalc();
    yolandCalc.setCompay_id(request.getParameter("company_id"));
    yolandCalc.setName(request.getParameter("company_name"));
    yolandCalc.setEnterprise_property(request.getParameter("enterprise_property"));
    yolandCalc.setBusiness_property(request.getParameter("business_property"));
    yolandCalc.setUntil_time(request.getParameter("until_time"));
    yolandCalc.setTotal_employee(request.getParameter("total_employee"));
    yolandCalc.setFull_time_employee(request.getParameter("full_time_employee"));
    yolandCalc.setPart_time_employee(request.getParameter("part_time_employee"));
    yolandCalc.setSh_employee(request.getParameter("sh_employee"));
    yolandCalc.setNot_sh_employee(request.getParameter("not_sh_employee"));
    yolandCalc.setPostgraduate(request.getParameter("postgraduate"));
    yolandCalc.setUndergraduate(request.getParameter("undergraduate"));
    yolandCalc.setJuniorcollege(request.getParameter("juniorcollege"));
    yolandCalc.setIncome(request.getParameter("income"));
    yolandCalc.setPay_per_income(request.getParameter("pay_per_income"));
    yolandCalc.setSocialpay_per_pay(request.getParameter("socialpay_per_pay"));
    yolandCalc.setQ1_enlarge(getStringfromParam(request.getParameterValues("q1_enlarge")));
    yolandCalc.setQ2_employee_type(getStringfromParam(request.getParameterValues("q2_employee_type")));
    yolandCalc.setQ3_employ_hard(getStringfromParam(request.getParameterValues("q3_employ_hard")));
    yolandCalc.setQ4_employ_use_hard(getStringfromParam(request.getParameterValues("q4_employ_use_hard")));
    yolandCalc.setQ5_employ_method(getStringfromParam(request.getParameterValues("q5_employ_method")));
    yolandCalc.setQ6_employ_lost_thread(getStringfromParam(request.getParameterValues("q6_employ_lost_thread")));
    yolandCalc.setQ7_why_employ_lost(getStringfromParam(request.getParameterValues("q7_why_employ_lost")));
    yolandCalc.setQ8_employ_socialpay_attr(getStringfromParam(request.getParameterValues("q8_employ_socialpay_attr")));
    yolandCalc.setQ9_employ_contract_attr(getStringfromParam(request.getParameterValues("q9_employ_contract_attr")));
    yolandCalc.setQ10_employ_probation_period(getStringfromParam(request.getParameterValues("q10_employ_probation_period")));
    yolandCalc.setQ11_employ_fire_method(getStringfromParam(request.getParameterValues("q11_employ_fire_method")));
    yolandCalc.setQ12_employ_hire_fire_method(getStringfromParam(request.getParameterValues("q12_employ_hire_fire_method")));
    yolandCalc.setS1_positivity(getStringfromParam(request.getParameterValues("s1_positivity")));
    yolandCalc.setS2_differentiation(getStringfromParam(request.getParameterValues("s2_differentiation")));
    yolandCalc.setS3_policy_direct(getStringfromParam(request.getParameterValues("s3_policy_direct")));
    yolandCalc.setS4_socialpay_free_time(getStringfromParam(request.getParameterValues("s4_socialpay_free_time")));
    yolandCalc.setS5_policy_support_direct(getStringfromParam(request.getParameterValues("s5_policy_support_direct")));
    yolandCalc.setS6_suitable_policy(getStringfromParam(request.getParameterValues("s6_suitable_policy")));
    yolandCalc.setOther_suggestion(getStringfromParam(request.getParameterValues("other_suggestion")));
    commonService.createYolandCalc(yolandCalc);
%>
<a href="/usavichV2/yolandCalcform.html">恭喜你，这条保存成功，请继续</a>
</body>
</html>