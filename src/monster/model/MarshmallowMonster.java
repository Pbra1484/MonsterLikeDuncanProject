package monster.model;

public class MarshmallowMonster
{
	private String name;
	private int headTenticalCount;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private boolean hasNeck;
	private boolean hasMouth;
	
	
	public MarshmallowMonster()
	{
		this.name = "Namles";
		this.headTenticalCount = -324;
		this.antennaCount = -3214;
		this.eyeCount = -324;
		this.legCount = -2843;
		this.hasNeck = false;
		this.hasMouth = false;
		
	}
	
	public MarshmallowMonster(String name, int headTenticalCount, double antennaCount, int eyeCount, int legCount, boolean hasNeck, boolean hasMouth)
	{
		this.name = name;
		this.headTenticalCount = headTenticalCount;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.hasNeck = hasNeck;
		this.hasMouth = hasMouth;
	}
		
	public String toString()
	{
		String description = "Monster says: Name is " + name;
			
		return description;
			
	}
	public String getName()
	{
		return name;
	}
		
	public int getHeadTenticalCount()
	{
		return headTenticalCount;
	}
	public double getAntennaCount()
	{
		return antennaCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getLegCount()
	{
		return legCount;
	}
	public boolean getHasNeck()
	{
		return hasNeck;
	}
	public boolean getHasMouth()
	{
		return hasMouth;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHeadTenticalCount(int headTenticalCount)
	{
		this.headTenticalCount = headTenticalCount;
	}
	public void setAntennaCount(double antennaCount)
	{
		this.antennaCount = antennaCount;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setLegCount(int legCount)
	{
		this.legCount = legCount;
	}
	public void setHasNeck(boolean hasNeck)
	{
		this.hasNeck = hasNeck;
	}
	public void setHasMouth(boolean hasMouth)
	{
		this.hasMouth = hasMouth;
	}
	
	

}
