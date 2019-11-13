package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    @NotNull
    private int employerId;

    @NotNull
    //@Size(min=1, message = "Employer may not be empty")
    private int employer;

    @NotNull
    //@Size(min=1, message = "Location may not be empty")
    private int location;

    @NotNull
    private int locationId;

    @NotNull
    private int coreCompetencyId;


    @NotNull
    //@Size(min=1, message = "Position Type may not be empty")
    private int positionType;

    @NotNull
    // @Size(min=1, message = "Core Competency may not be empty")
    private int coreCompetency;
    /*
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
     */

    public Employer getEmployer(){
        JobData jobData = JobData.getInstance();
        return jobData.getEmployers().findById(this.employerId);
    }


    public void setEmployer(int employer) {
        this.employer = employer;
    }

    public Location getLocation(){
        JobData jobData = JobData.getInstance();
        return jobData.getLocations().findById(this.locationId);
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCoreCompetency() {
        return coreCompetency;
    }

    public void setPositionType(int positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCompetency(){
        JobData jobData = JobData.getInstance();
        return jobData.getCoreCompetencies().findById(this.coreCompetencyId);
    }
     public void setCoreCompetency(int coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getCoreCompetencyId() {
        return coreCompetencyId;
    }
    public void setCoreCompetencyId(int coreCompetenciesId) {
        this.coreCompetencyId = coreCompetenciesId;
    }


    private int positionTypeId;

    public PositionType getPositionType(){
        JobData jobData = JobData.getInstance();
        return jobData.getPositionTypes().findById(this.positionTypeId);
    }

    public int getPositionTypeId() {
        return positionTypeId;
    }

    public void setPositionTypeId(int positionTypesId) {
        this.positionTypeId = positionTypesId;
    }

    @NotNull
    private ArrayList<PositionType> positionTypes;
    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;


    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */
        coreCompetencies = jobData.getCoreCompetencies().findAll();

        positionTypes = jobData.getPositionTypes().findAll();

        locations = jobData.getLocations().findAll();

        employers = jobData.getEmployers().findAll();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}