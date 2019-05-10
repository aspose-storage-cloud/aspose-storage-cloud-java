#Aspose.Storage for Cloud Java SDK Repository

This repository contains Aspose.Storage for Cloud Java SDK source code. This SDK allows you to work with Aspose.Storage for Cloud REST APIs in your Java applications quickly and easily. 

<p align="center">
  <a title="Download complete Aspose.Storage for Cloud source code" href="https://github.com/asposetotal/Aspose_total_Cloud/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

##How to Use the SDK?
The complete source code is available in this repository folder, you can either directly use it in your project or use Maven. For more details, please visit our [documentation website](http://www.aspose.com/docs/display/totalcloud/Available+SDKs).

##Quick SDK Tutorial
```
// Instantiate Aspose Storage API SDK
StorageApi storageApi = new StorageApi(apiKey, appSID);

//set input file name
String fileName = "SampleWordDocument.docx";
//set cloud storage info
String storage = null; // default: aspose cloud storage
String folder = null; //no nested folder in cloud storage

//upload input file to aspose cloud storage
storageApi.PutCreate(fileName, "", storage, new File(getClass().getResource("/" + fileName).toURI()));

```
## Resources
+ [**Web API reference**](https://apireference.aspose.cloud/storage/)
+ [**Website**](https://www.aspose.cloud/)
+ [**Documentation**](https://docs.aspose.cloud/display/storagecloud/Home)
+ [**Free Support Forum**](https://forum.aspose.cloud/c/storage)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)
