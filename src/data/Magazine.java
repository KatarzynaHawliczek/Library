package data;

import java.time.LocalDate;

public class Magazine extends Publication
{
	private static final long serialVersionUID = 2061400934707882805L;
	private String language;
	
	public int getMonth()
	{
		return getDate().getMonthValue();
	}
	
	public int getDay()
	{
		return getDate().getDayOfMonth();
	}
	
	
	public String getLanguage()
	{
		return language;
	}
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	public Magazine(String title, String publisher, String language, int year, int month, int day)
	{
		super(year, title, publisher);
		setLanguage(language);
		setDate(LocalDate.of(year, month, day));
	}
	
	@Override
	public String toString()
	{
		StringBuilder print = new StringBuilder(32);
		print.append(getTitle());
		print.append("; ");
		print.append(getPublisher());
		print.append("; ");
		print.append(getYear());
		print.append("; ");
		print.append(getMonth());
		print.append("; ");
		print.append(getDay());
		print.append("; ");
		print.append(getLanguage());
		return print.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(!super.equals(obj))
		{
			return false;
		}
		if(getClass() != obj.getClass())
		{
			return false;
		}
		Magazine other = (Magazine)obj;
		if(language == null)
		{
			if(other.language != null)
			{
				return false;
			}
		}
		else if(!language.equals(other.language))
		{
			return false;
		}
		return true;
	}
}
