package stepsDefinition;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class funeralDignityPlan {


    @Steps
    MemberPage memberPage;
    @Steps
    HomePage homePage;
    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;
    @Steps
    PayerDetails payerDetails;

    @Steps
    confirmationPage confirmationPage;
    @Given("User is on the dignity plan page")
    public void user_is_on_the_dignity_plan_page() {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        homePage.clickContinueBtn();


    }
    @When("User completes the required  Member details .")
    public void user_completes_the_required_member_details() {
        memberPage.SelectTitle("Mr");
        memberPage.EnterName("Thomas");

        memberPage.Entersurname("Dlamina");
        memberPage.enterMemberIDnum("9512129348087");
=======
      
        memberPage.enterMobileNum("0854122350");
        memberPage.enterPostalAddress("1196 elves street");
        memberPage.EnterPostalCode("1205");
        memberPage.selectIncome("R15,000 - R18,000");
        memberPage.selectOccupation("Skilled agriculture");
        memberPage.selectEducation("Post-graduate (Honours, Masters etc)");
        memberPage.acceptFICAdecl("Yes");
        memberPage.acceptFicaDeclaration2("Yes");
        memberPage.clickContinueBt();

    }
    @When("User adds two additional members, a spouse and child to the policy")
    public void user_adds_two_additional_members_a_spouse_and_child_to_the_policy() {
           additionalMembers.addSpouse();
           additionalMembers.selectTitle("Dr");
           additionalMembers.enterSpouseName("David");

           additionalMembers.enterSpouseSurname("Dlamina");
=======
     

           additionalMembers.selectSpouseGender("Male");

           additionalMembers.enterSpouseDateOfBirth("1989","Oct","1");
=======
           additionalMembers.EnterSpouseIDNo("6806118090988");
           additionalMembers.enterSpouseDateOfBirth("1989","Oct","20");

           // add implementation to add ID
           additionalMembers.saveSpousedtls();

           // adding child
           additionalMembers.addChildrencheckBox();
           additionalMembers.EnterChildName("Ismael");

           additionalMembers.EnterChildSurname("Dlamina");


           additionalMembers.selectChildGender("Male");
           additionalMembers.IsChildStudentOrNot("Yes");
           additionalMembers.childDateOfBirth("2008","Dec","1");

           //add implementation for ID Number


           additionalMembers.SaveChildDetails();
           additionalMembers.clickContinue();


    }
    @When("User adds two beneficiaries for the policy by allocating percentage")
    public void user_adds_two_beneficiaries_for_the_policy_by_allocating_percentage() throws InterruptedException {
       beneficiaryDetails.EnterBeneficiaryName("Thabo");
       beneficiaryDetails.SelectBeneficiaryTite("Mr");

       beneficiaryDetails.EnterBeneficiarySurname("Duma");
       beneficiaryDetails.EnterDateOfBirth("1", "Dec", "1990");
       beneficiaryDetails.SelectBeneficiaryRelationship("Father-in-Law");
       beneficiaryDetails.SelectPercentageAllocation("100%");
//        Thread.sleep(5000);

//        // second beneficiary
//        beneficiaryDetails.EnterBeneficiaryName("Thami");
//        beneficiaryDetails.EnterBeneficiarySurname("Close");
//        beneficiaryDetails.EnterDateOfBirth("1", "Dec", "1980");
//        beneficiaryDetails.SelectBeneficiaryRelationship("Father-in-Law");
//        beneficiaryDetails.SelectPercentageAllocation("50");

        beneficiaryDetails.clickSaveDetails();
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(3000);


    }
    @When("User completes the Payer details by completing required information")
    public void user_completes_the_payer_details_by_completing_required_information() {

        payerDetails.SelectPayerTitle("Mr");
        payerDetails.EnterPayerName("Ismael");
        payerDetails.EnterPayerSurname("Direro");
        payerDetails.EnterPayIDNumber("7011254071087");
        payerDetails.EnterPayerMobileNumber("0745862021");
        payerDetails.SelectBankName("STANDARD BANK OF S.A. LTD");
        payerDetails.SelectAccountType("Savings Account");
        payerDetails.EnterAccNumber("1234");
        payerDetails.EnterDebitDate("20");
        payerDetails.Cellphone_on_hand("No");
        payerDetails.debitBankAcc();
        payerDetails.clickContinueBtn();


    }
    @When("user confirms the captured information on policy confirmation page")
    public void user_confirms_the_captured_information_on_policy_confirmation_page() {

//        confirmationPage.viewPremium();
//        confirmationPage.ViewWhoIsCovered();
//        confirmationPage.ViewBenefits();
//        confirmationPage.AnnualIncrease();
//        confirmationPage.disclaimer();


        System.out.println("Will add code after test");

    }
    @When("user accepts the terms and condition")
    public void user_accepts_the_terms_and_condition() {
        confirmationPage.clickTermsAndConditions();
        confirmationPage.ClickConfirmBtn();
    }
    @Then("user should be able to see the policy number, correct monthly premium")
    public void user_should_be_able_to_see_the_policy_number_correct_monthly_premium() {

        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth();
        confirmationPage.PolicyNumber();

    }
    @Then("User shouldn't be able to proceed with application if allocated percentage is less than {int} percent.")
    public void user_shouldn_t_be_able_to_proceed_with_application_if_allocated_percentage_is_less_than_percent(Integer Percentage) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects member estate as as a relationship to the beneficiary.")
    public void user_selects_member_estate_as_as_a_relationship_to_the_beneficiary() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the percentage allocation should default to {int} percent.")
    public void the_percentage_allocation_should_default_to_percent(Integer percentage) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






}
