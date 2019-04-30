package com.hinduja.asterix.project2;
import java.sql.*;

public class EventTable
 {
    int id;
    String eventName,eventAbstractId,cordinator,entryFee,date;

	public EventTable()
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
	
	public String getEventName()
		{
        return eventName;
		}

    public void setEventName(String eventName)
		{
        this.eventName = eventName;
		}

    public String getEventAbstractId()
		{
        return eventAbstractId;
		}

    public void setEventAbstractId(String eventAbstractId)
		{
        this.eventAbstractId = eventAbstractId;
		}

    public String getCordinator()
		{
        return cordinator;
		}

    public void setCordinator(String cordinator)
		{
        this.cordinator = cordinator;
		}
		
	public String getEntryFee()
		{
        return entryFee;
		}

    public void setEntryFee(String entryFee)
		{
        this.entryFee = entryFee;
		}

	public String getDate()
		{
        return date;
		}

    public void setDate(String date)
		{
        this.date = date;
		}

    
}