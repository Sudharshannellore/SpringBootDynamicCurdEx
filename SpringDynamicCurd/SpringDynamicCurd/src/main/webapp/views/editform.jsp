<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>EditUser</h1>
       <form:form method="GET" action="/editandsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="userid" /></td>  
         </tr>  
         <tr>    
            <td>Name :</td>    
            <td><form:input path="username" /></td>  
           </tr>  
         <tr>    
          <td>Email : </td>   
          <td><form:input path="email"  /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="EditSave" /></td>    
         </tr>    
        </table>    
       </form:form>