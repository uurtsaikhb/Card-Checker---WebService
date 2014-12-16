/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import object.Card;

/**
 *
 * @author uurtsaikh
 */
@WebService(serviceName = "BankWebService")
public class BankWebService {

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    
    
    
    String dinner [][] = {{"323145671323234","123","1","2015"},
                            {"323145671323235","223","2","2016"},
                            {"323143452346363","265","4","2015"},
                            {"323142345335532","666","5","2016"}};
    
    String discover [][] = {{"623145671323421","165","7","2015"},
                            {"623145671323422","234","2","2017"},
                            {"623145671323422","543","6","2017"},
                            {"623145671323422","653","5","2018"}};
    
    String master [][] = {{"523145671323421","123","1","2015"},
                            {"523145671323422","223","2","2016"},
                            {"523145671323422","223","2","2016"},
                            {"523145671323422","223","2","2016"}};
    
    String visa [][] = {{"423145671323421","123","1","2015"},
                            {"423145671323422","223","2","2016"},
                            {"423145671323422","223","2","2016"},
                            {"423145671323422","223","2","2016"}};
    /**
     * Web service operation
     *
     * @param cardType
     * @param cardNumber
     * @param securityCode
     * @param expdateMonth
     * @param expdateYear
     * @return
     */
    @WebMethod(operationName = "checkCard")
    public Boolean checkCard(@WebParam(name = "cardType") String cardType, @WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "securityCode") String securityCode, @WebParam(name = "expdateMonth") String expdateMonth, @WebParam(name = "expdateYear") String expdateYear) {

        Card card = new Card();
            card.setCardNumber(cardNumber);
            card.setSecurityNumber(securityCode);
            card.setExpdateMonth(expdateMonth);
            card.setExpdateYear(expdateYear);
            
        if (cardType.equals("american")) {
           return checkAmerican(card);
           
        } else {
            return false;
        }
        
    }
    
    
    
    public boolean checkAmerican (Card card) {
        
        String american [][] = {{"323145671323421","123","1","2015"},
                                {"323145671323422","223","2","2016"},
                                {"323145671323422","223","2","2016"},
                                {"323145671323422","223","2","2016"}};
        
        for (int i = 0; i < american.length; i ++) {
            if (card.getCardNumber().equals(american[i][0]) && 
                    card.getSecurityNumber().equals(american[i][1]) &&
                    card.getExpdateMonth().equals(american[i][2]) &&
                    card.getExpdateYear().equals(american[i][3])) {

                return true;
            }
                
        }
        
        return false;
    }

}
