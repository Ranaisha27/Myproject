<%@page import="java.util.*"%>
<%@page import="Model.Expanse"%>
<%@page import="org.hibernate.*"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Display</title>
        <link rel="stylesheet" href="DashStyle.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    </head>

    <body class="bg-light p-0">
        
        <nav class="navbar navbar-expand-lg bg-light mt-5 mb-3" style="height: 50px;">
            <i class="fas fa-coins fa-2x mx-2"></i>
            <div class="navbar-brand" style="font-size: 25px;">E-Z Money</div>
            <div class="container ml-5 brand-text">Expenditure Management System</div>
            <div>
                <a href="Home.html" class="btn btn-outline-danger btn-text">Logout</a>
            </div>
        </nav>

        <div class="row p-4">
            <div class="clo-3 bg-dark" style="height:500px; width: 300px;">

                
                <div class="container " style="margin-top:100px;">
                    <a href="DashBoard.html" class="h1 text-light option-text" style="cursor:pointer;">Dashboard</a>
                </div>


                <div class="container" style="margin-top:70px;">
                    <a href="AddAcc.html" class="h1 text-light option-text" style="cursor:pointer;">Add account details</a>
                </div>

                <div class="container " style="margin-top:100px;">
                    <a href="Addexp.html" class="h1 text-light option-text" style="cursor:pointer;">Add Expanse</a>
                </div>

            </div>
            
            <% 
                
                                        String desc , date;
                                        int debit , credit;
                                        long accNo , currBal;
                                        
                                        List<Expanse> list = (List)request.getAttribute("list");
                                        Iterator<Expanse> it = list.iterator();
                                        Iterator<Expanse> it1 = list.iterator();
                                        Expanse ex = null;
                                        try{
                                            ex = (Expanse)it.next();
                                            accNo = ex.getAccno();
                                            currBal = ex.getCurrBal();
                                            while(it.hasNext()){
                                            ex = (Expanse)it.next();    
                                            currBal = ex.getCurrBal();
                                            
                                            }
                                            
            %>
            
            

            <div class="col img-col ml-4">
                <div class="row">
                    <div class="col text-center text-white">
                        <div class="h5 my-3">Account Number : <%=accNo%></div>
                        <div class="h5 my-3">Current Balance : <%=currBal%></div>
                        <table class="table stripped-table">
                            <thead class="h4 text-warning th">
                                <tr>
                                    
                                    <th>Description</th>
                                    <th>Debit</th>
                                    <th>Credit</th>
                                    <th>Date</th>
                                </tr>
                                
                            </thead>   
                                    
                            <tbody class="text-light h4 ">
                                
                                <%
                                    
                                    
                                    while (it1.hasNext()){

                                        ex = (Expanse)it1.next();
                                        desc = ex.getDescription();
                                        date = ex.getDate();
                                        debit = ex.getDebit();
                                        credit = ex.getCredit();
                                        
                                
                                %>
                                    
                                            
                                    
                                <tr>
                                                <td><%=desc%></td>
                                                <td><%=debit%></td>
                                                <td><%=credit%></td>
                                                <td><%=date%></td>
                    
                                </tr>
                                            
                                    <%
                                                }
                                        }catch(Exception e){
                                            e.printStackTrace();
                                        }
                                        
                                    %>
                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>