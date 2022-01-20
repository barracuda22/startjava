public class Variables {
    protected String deviceName;
    protected String processorName;
    protected float processorSpeed;
    protected String deviceID;
    protected String productID;
    protected String systemType;
    protected boolean penOrTouch;
    protected String softwareVersion;
    protected String softwareInstallDate;
    protected String osBuild;
    protected String serialNumber;
    protected String softwareInfo;

    public Variables(String devName, String procName, float procSpeed, String devID, String prodID, String sysType, boolean p_or_t, String swVer,
                     String swInstDt, String osBld, String serNum, String swInfo) {
        deviceName = devName;
        processorName = procName;
        processorSpeed = procSpeed;
        deviceID = devID;
        productID = prodID;
        systemType = sysType;
        penOrTouch = p_or_t;
        softwareVersion = swVer;
        softwareInstallDate = swInstDt;
        osBuild = osBld;
        serialNumber = serNum;
        softwareInfo = swInfo;
    }

    public void showAll() {
        System.out.println("Device Name:               " + deviceName);
        System.out.println("Processor Name:            " + processorName);
        System.out.println("Processor Speed:           " + processorSpeed + " GHz");
        System.out.println("Device ID:                 " + deviceID);
        System.out.println("Product ID:                " + productID);
        System.out.println("System Type:               " + systemType);
        System.out.println("Pen or Touch:              " + penOrTouch);
        System.out.println("Software Version:          " + softwareVersion);
        System.out.println("Software Installed On:     " + softwareInstallDate);
        System.out.println("OS Build:                  " + osBuild);
        System.out.println("Serial Number:             " + serialNumber);
        System.out.println("Software Info:             " + softwareInfo);

    }

    public static void main(String[] args) {
        Variables myPCVars = new Variables("Desktop", "AMD Athlon",
                2.30F, "C21C4772-4E18-4ADA-B78E-15A98F4C94A2", "00325-81875-71499-AAOEM",
                "64-bit", false,
                "Windows 11", "1/\u200E15/\u200E2022", "22533.1001", "MJ0DBNEH",
                "Windows Feature Experience Pack 1000.22533.1001.0");
        myPCVars.showAll();
    }
}