package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedinStepDef {
    @Given("I open LinkedIn login page")
    public void iOpenLinkedInLoginPage() { }

    @When("I input email and password")
    public void iInputEmailAndPassword() { }

    @When("I click button login")
    public void iClickButtonLogin() {}

    @Then("I can see my news feed")
    public void iCanSeeMyNewsFeed() { }


    @When("I click posting coloumn")
    public void iClickPostingColoumn() {    }

    @And("I write some information for sharing")
    public void iWriteSomeInformationForSharing() { }

    @And("I click posting")
    public void iClickPosting() {  }

    @Then("People who followed me can see it")
    public void peopleWhoFollowedMeCanSeeIt() {   }


    @When("I click job in taskbar")
    public void iClickJobInTaskbar() {    }

    @Then("I can see any job opportunity")
    public void iCanSeeAnyJobOpportunity() { }

    @And("I can choose a job according to my criteria")
    public void iCanChooseAJobAccordingToMyCriteria() {  }


    @When("I click searching in taksbar")
    public void iClickSearchingInTaksbar() {

    }

    @And("I write {string}")
    public void iWrite(String ueu) {

    }

    @And("I click search button")
    public void iClickSearchButton() {

    }

    @Then("I can see about {string} and people who in circle")
    public void iCanSeeAboutAndPeopleWhoInCircle(String ueu) {
    }

    @When("I click icon notifikasi")
    public void iClickIconNotifikasi() {
        
    }

    @Then("I can see activities about my circle and anymore")
    public void iCanSeeActivitiesAboutMyCircleAndAnymore() {
        
    }

    @When("I click my avatar")
    public void iClickMyAvatar() {
        
        
    }

    @And("I click view profile")
    public void iClickViewProfile() {
    }

    @Then("I can see edit and update my profile")
    public void iCanSeeEditAndUpdateMyProfile() {
    }
}
