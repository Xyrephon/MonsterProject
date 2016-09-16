package monster.model;

public class MarshmallowMonster
{

	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	
	public MarshmallowMonster()
	{
		this.name = "no name here";
		this.antennaCount = -23423.131235;
		this.eyeCount = -12345678;
		this.hasBellyButton = false;
		this.armCount = -32436;
		this.noseCount = -7765;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int armCount, int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
	}
	
	public String toString()
	{
		String description = "Name is " + this.name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAntennaCount(double antennaCount)
	{
		this.antennaCount = antennaCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setNoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}

}

