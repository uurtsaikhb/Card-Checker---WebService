/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author uurtsaikh
 */
public class Card {
    
    private String cardNumber;
    private String securityNumber;
    private String expdateMonth;
    private String expdateYear;

    public Card() {
        
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getExpdateMonth() {
        return expdateMonth;
    }

    public void setExpdateMonth(String expdateMonth) {
        this.expdateMonth = expdateMonth;
    }

    public String getExpdateYear() {
        return expdateYear;
    }

    public void setExpdateYear(String expdateYear) {
        this.expdateYear = expdateYear;
    }
    
    
}
