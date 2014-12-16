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
         
        boolean isCorrect = false;
        switch (cardType) {
            case "american" : isCorrect = checkAmerican(card); break;
            case "visa" : isCorrect = checkVisa(card); break;
            case "master" : isCorrect = checkMaster(card); break;
            case "discover" : isCorrect = checkDiscover(card); break;
            case "dinner" : isCorrect = checkDinner(card); break;
        }
        
        return isCorrect;
//        
//        if (cardType.equals("american")) {
//           return checkAmerican(card);
//           
//        } else {
//            return false;
//        }
        
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
    
    public boolean checkVisa (Card card) {
        
        String visa [][] = {{"423145671323421","123","1","2015"},
                            {"423145671323422","223","2","2016"},
                            {"423145671323422","223","2","2016"},
                            {"423145671323422","223","2","2016"}};
        
        for (int i = 0; i < visa.length; i ++) {
            if (card.getCardNumber().equals(visa[i][0]) && 
                    card.getSecurityNumber().equals(visa[i][1]) &&
                    card.getExpdateMonth().equals(visa[i][2]) &&
                    card.getExpdateYear().equals(visa[i][3])) {

                return true;
            }
                
        }
        return false;
    }
    
    public boolean checkDinner (Card card) {
        
        String dinner [][] = {{"323145671323234","123","1","2015"},
                            {"323145671323235","223","2","2016"},
                            {"323143452346363","265","4","2015"},
                            {"323142345335532","666","5","2016"}};
        
        for (int i = 0; i < dinner.length; i ++) {
            if (card.getCardNumber().equals(dinner[i][0]) && 
                    card.getSecurityNumber().equals(dinner[i][1]) &&
                    card.getExpdateMonth().equals(dinner[i][2]) &&
                    card.getExpdateYear().equals(dinner[i][3])) {

                return true;
            }
                
        }
        return false;
        
    }
    
    public boolean checkDiscover (Card card) {
        
        String discover [][] = {{"623145671323421","165","7","2015"},
                            {"623145671323422","234","2","2017"},
                            {"623145671323422","543","6","2017"},
                            {"623145671323422","653","5","2018"}};
        
        for (int i = 0; i < discover.length; i ++) {
            if (card.getCardNumber().equals(discover[i][0]) && 
                    card.getSecurityNumber().equals(discover[i][1]) &&
                    card.getExpdateMonth().equals(discover[i][2]) &&
                    card.getExpdateYear().equals(discover[i][3])) {

                return true;
            }
                
        }
        return false;
        
    }
    
    public boolean checkMaster (Card card) {
        
        String master [][] = {{"523145671323421","123","1","2015"},
                            {"523145671323422","223","2","2016"},
                            {"523145671323422","223","2","2016"},
                            {"523145671323422","223","2","2016"}};
        
        for (int i = 0; i < master.length; i ++) {
            if (card.getCardNumber().equals(master[i][0]) && 
                    card.getSecurityNumber().equals(master[i][1]) &&
                    card.getExpdateMonth().equals(master[i][2]) &&
                    card.getExpdateYear().equals(master[i][3])) {

                return true;
            }
                
        }
        return false;
        
    }

}
