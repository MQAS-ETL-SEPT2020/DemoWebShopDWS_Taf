package com.DemoWebShopapp.pages;

import org.automation.base.BasePage;
import org.automation.elements.Button;
import org.automation.elements.CheckBox;
import org.automation.elements.DropDown;
import org.automation.elements.Element;
import org.automation.elements.RadioButton;
import org.automation.elements.TextBox;
import org.openqa.selenium.By;

/**
 *  @author TYS-Megha D
 * 
 * @version 1.0.0
 * @since 14/11/2022
 *
 */

public class CheckoutPage extends BasePage {

	// <<<<<<<<<<<<<<<<<<<<Billing Address Field>>>>>>>>>>>>>>>>>>>>

	public final Element CheckoutPage = new Element("CheckOut Page", By.xpath("//h1[text()='Checkout']"));
	public final Element BillingAddressField = new Element("BillingAddressField",
			By.xpath("//h2[text()='Billing address']"));
	public final DropDown BillingAddressDropDown = new DropDown("BillingAddress",
			By.xpath("//select[@id='billing-address-select']"));
	public final Element NewAddress = new Element("New Address", By.xpath("//option[text()='New Address']"));
	public final TextBox FirstName = new TextBox("FirstName TextField", By.id("BillingNewAddress_FirstName"));
	public final TextBox LastName = new TextBox("LastName TextField", By.id("BillingNewAddress_LastName"));
	public final TextBox Email = new TextBox("Email id TextField", By.id("BillingNewAddress_Email"));
	public final TextBox Company = new TextBox("Company TextField", By.id("BillingNewAddress_Company"));
	public final DropDown CountryIdInBilling = new DropDown("Country Id", By.id("BillingNewAddress_CountryId"));
	public final Element CountryNameInBilling = new Element("Country Name InBilling",
			By.xpath("//option[text()='India']"));
	public final TextBox City = new TextBox("City TextField", By.id("BillingNewAddress_City"));
	public final TextBox Address1InBilling = new TextBox("Address1 In Billing", By.id("BillingNewAddress_Address1"));
	public final TextBox ZipPostalCodeInBilling = new TextBox("Zip/PostalCode In Billing",
			By.id("BillingNewAddress_ZipPostalCode"));
	public final TextBox PhoneNumberInBilling = new TextBox("Phone Number In Billing",
			By.id("BillingNewAddress_PhoneNumber"));
	public final Button ContinueInBilling = new Button("Continue Button In Billing",
			By.xpath("//input[@onclick='Billing.save()']"));

	// <<<<<<<<<<<<<<<<<<<<<<<<Shipping Address Field>>>>>>>>>>>>>>>>>>>>>>>>

	public final Element ShippingAddressFeild = new Element("Shipping address feild",
			By.xpath("(//div[@class='step-title'])[2]"));
	public final Element newShippingAddressFeild = new Element("Shipping Address", By.id("shipping-address-select"));
//	public final  DropDown NewShippingAddress=new DropDown("New ShippingAddress",By.xpath("(//option[text()='New Address'])[2]"));
//    public final DropDown CountryIdinShipping=new DropDown("Country Dropdown",By.id("ShippingNewAddress_CountryId"));
//	public final TextBox CityTextFeildinShipping=new TextBox("City textfeild in shipping ",By.id("ShippingNewAddress_City"));
//	public final TextBox Address1inShipping=new TextBox("Address1 in Shipping",By.id("ShippingNewAddress_Address1"));
//    public final TextBox ZiporPostalcodeinShipping=new TextBox("Zip/PostalCode",By.id("ShippingNewAddress_ZipPostalCode"));
//    public final TextBox PhonenumberinShipping=new TextBox("Phonenumber in Shipping",By.xpath("//input[@name='ShippingNewAddress.PhoneNumber']"));
	public final Button ContinueinShipping = new Button("Continue Button in Shipping",
			By.xpath("(//input[@title='Continue'])[2]"));
	public final CheckBox InStorePickup = new CheckBox("InstorePickup Checkbox", By.id("PickUpInStore"));

	// <<<<<<<<<<<<<<<<<<<<<<<<<shipping Method>>>>>>>>>>>>>>>>>>>>>>>>>

//    public final Element ShippingMethod=new Element("Shipping Method Title",By.xpath("(//div[@class='step-title'])[3]"));
//	public final RadioButton Ground=new RadioButton("Ground RadioButton",By.xpath("//label[@for='shippingoption_0']"));
//	public final RadioButton NextDaySAir=new RadioButton("NextDaysAir RadioButton",By.id("shippingoption_1")) ;
//	public final RadioButton SecondDayAir=new RadioButton("Second Day Air RadioButton",By.id("shippingoption_2"));
//	public final Button ContinueinShippingMethod=new Button("Continue Button in Shipping Method",By.xpath("//input[@onclick='ShippingMethod.save()']"));
//	

	// <<<<<<<<<<<<<<<<<<<<<<<<<<Payment Method Field>>>>>>>>>>>>>>>>>>>>>>>>>>

	public final Element PaymentMethodField = new Element("PaymentMethodField",
			By.xpath("//h2[text()='Payment method']"));
	public final RadioButton CashOnDelivery = new RadioButton("CashOnDelivery",
			By.xpath("//label[text()='Cash On Delivery (COD) (7.00)']"));
	public final RadioButton CheckMoneyOrder = new RadioButton("",
			By.xpath("//label[text()='Check / Money Order (5.00)']"));
	public final RadioButton CreditCard = new RadioButton("CreditCard", By.xpath("//label[text()='Credit Card']"));
	public final RadioButton PurchaseOrder = new RadioButton("PurchaseOrder",
			By.xpath("//label[text()='Purchase Order']"));
	public final Element PoNumber = new Element("PoNumber", By.xpath("//input[@name='PurchaseOrderNumber']"));
	public final Button ContinueButtonInPonumber = new Button("ContinueButton In Ponumber",
			By.xpath("(//input[@value='Continue'])[5]"));
	public final Button BackButtonInPaymentMethod = new Button("BackButton In PaymentMethod",
			By.xpath("(//a[text()='Back'])[1]"));
	public final Button BackButtonInPoNumber = new Button("BackButton In PoNumber",
			By.xpath("(//a[text()='Back'])[4]"));
	public final Button ContinueInPaymentMethod = new Button("ContinueInPaymentMethod",
			By.xpath("//input[@class='button-1 payment-method-next-step-button']"));

	// <<<<<<<<<<<<<<<<<<<<<<<<<<Payment Information Field>>>>>>>>>>>>>>>>>>>>>>>>>>

	public final Element CodText = new Element("Cod_Text", By.xpath("//p[text()='You will pay by COD']"));
	public final Element PaymentInformationField = new Element("Payment Information Field",
			By.xpath("//h2[text()='Payment information']"));
	public final Button BackButtonInPaymentInformation = new Button("BackButton In Payment Information",
			By.xpath("(//a[text()='Back'])[2]"));
	public final Button ContinueInPaymentInformation = new Button("Continue In Payment Information",
			By.xpath("//input[@class='button-1 payment-info-next-step-button']"));

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Confirm Order>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public final Element PaymentmethodText = new Element("Paymentmethod Text",
			By.xpath("//strong[text()='Payment Method']"));
	public final Element BillingAddressText = new Element("BillingAddress Text",
			By.xpath("//strong[text()='Billing Address']"));
	public final Element ConfirmOrderField = new Element("ConfirmOrder Field",
			By.xpath("//h2[text()='Confirm order']"));
	public final Button BackButtonInConfirmationOrder = new Button("BackButton In ConfirmationOrder",
			By.xpath("(//a[text()='Back'])[3]"));
	public final Button ConfirmInConfirmationOrder = new Button("Confirm In ConfirmationOrder",
			By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Thank You
	// page>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public final Element ThankYouPage = new Element("ThankYou Page", By.xpath("//h1[text()='Thank you']"));
	public final Element ConfirmationMessage = new Element("Confirmation Message",
			By.xpath("//strong[text()='Your order has been successfully processed!']"));
	public final Element OrderNumber = new Element("OrderNumber", By.xpath("//ul[@class='details']/li[1]"));
	public final Button ContinueInThankYouPage = new Button("Continue In ThankYou Page",
			By.xpath("//input[@class='button-2 order-completed-continue-button']"));
	public final Element ApplicationHomePage = new Element("Application HomePage",
			By.xpath("//img[@alt='Tricentis Demo Web Shop']"));

}