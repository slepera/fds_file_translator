package plt.fds.filetranslator;

import plt.fds.filetranslator.data_models.PassPlan;

public class PassPlanXMLGenerator {

    public static void GeneratePassPlanXML(PassPlan passPlan)
    {
        System.out.println("Start writing the XML file containing the PassPlan");
        // To be completed with code for XML file creation

        for(int i = 0; i < passPlan.visibilityTypes.length; i++)
        {
            System.out.println(passPlan.visibilityTypes[i].satelliteID);
            System.out.println(passPlan.visibilityTypes[i].stationID);
        }


    }

}
