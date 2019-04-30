package com.hinduja.asterix.project2;
import java.sql.*;
public class Entries

 {
    int id;
    String eventAbstractId,name,contact,email,collegeId,streamId;

    public Entries()
		{
		}

    public int getId()
		{
        return id;
		}

    public void setId(int id)
		{
        this.id = id;
		}
    public String getEventAbstractId()
		{
        return eventAbstractId;
		}
	
	public void setEventAbstractId(String eventAbstractId)
		{
        this.EventAbstractId = eventAbstractId;
		}

    public String getName()
		{
        return name;
		}
	
	public void setName(String name)
		{
        this.name = name;
		}

    public String getContact()
		{
        return contact;
		}

	public void setContact(String contact)
		{
        this.contact = contact;
		}

	public String getEmail()
		{
        return email;
		}

    public void setEmail(String email)
		{
        this.email = email;
		}

    public String getCollegeId()
		{
        return collegeId;
		}
	
	public void setCollegeId(String collegeId)
		{
        this.collegeId = collegeId;
		}

    public String getStreamId()
		{
        return streamId;
		}
	
	public void setStreamId(String streamId)
		{
        this.streamId = streamId;
		}
}