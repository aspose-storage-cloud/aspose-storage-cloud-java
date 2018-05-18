import com.aspose.storage.api.StorageApi;
import com.aspose.storage.client.ApiException;
import com.aspose.storage.model.*;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
/**
 * Created by muhammadsohailismail on 15/05/2018.
 */
public class StorageApiTest {

    private final StorageApi api = new StorageApi("https://api.aspose.cloud/v1.1", "xxxxx", "xxxxx");

    /**
     * Remove a specific file
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileTest() throws ApiException {
        String path = "testfile.txt";
        String versionId = null;
        String storage = null;
        RemoveFileResponse response = api.DeleteFile(path, versionId, storage);
        assertNotNull(response);
    }

    /**
     * Remove a specific folder
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFolderTest() throws ApiException {
        String folderName = "Pictures";
        String storage = null;
        Boolean recursive = true;
        RemoveFolderResponse response = api.DeleteFolder(folderName, storage, recursive);
        assertNotNull(response);
    }

    /**
     * Check the disk usage of the current account
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDiscUsageTest() throws ApiException {
        String storage = null;
        DiscUsageResponse response = api.GetDiscUsage(storage);
        assertNotNull(response);
    }

    /**
     * Download a specific file
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDownloadTest() throws ApiException {
        String fileName = "testfile.txt";
        String versionId = null;
        String storage = null;
        File file = api.GetDownload(fileName, versionId, storage);
        assertNotNull(file);
    }

    /**
     * Check if a specific file or folder exists
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIsExistTest() throws ApiException {
        String path = "testfile.txt";
        String versionId = null;
        String storage = null;
        FileExistResponse response = api.GetIsExist(path, versionId, storage);
        assertNotNull(response);
    }

    /**
     * Check if storage exists
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIsStorageExistTest() throws ApiException {
        String name = "MyDropboxStorage";
        StorageExistResponse response = api.GetIsStorageExist(name);
        assertNotNull(response);
    }

    /**
     * Get the file&#39;s versions list
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListFileVersionsTest() throws ApiException {
        String path = "testfile.txt";
        String storage = null;
        FileVersionsResponse response = api.GetListFileVersions(path, storage);
        assertNotNull(response);
    }

    /**
     * Get the file listing of a specific folder
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListFilesTest() throws ApiException {
        String path = "templates";
        String storage = null;
        FilesResponse response = api.GetListFiles(path, storage);
        assertNotNull(response);
    }

    /**
     * Move a specific file
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMoveFileTest() throws ApiException {
        String src = "testfile.txt";
        String dest = new File("Documents/", "/testfile.txt").getPath();
        String versionId = null;
        String storage = null;
        String destStorage = null;
        MoveFileResponse response = api.PostMoveFile(src, dest, versionId, storage, destStorage);
        assertNotNull(response);
    }

    /**
     * Move a specific folder
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMoveFolderTest() throws ApiException {
        String src = "moveFrom";
        String dest = "moveTo";
        String storage = null;
        String destStorage = null;
        MoveFolderResponse response = api.PostMoveFolder(src, dest, storage, destStorage);
        assertNotNull(response);
    }

    /**
     * Upload a specific file
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCreateTest() throws ApiException {
        String path = "testfile.txt";
        File file = new File("src/test/data/" + path);
        if(!file.exists()) {
            System.out.println("The file does not exist");
        }
        String versionId = null;
        String storage = null;
        ResponseMessage response = api.PutCreate(path, versionId, storage, file);
        assertNotNull(response);
    }

    /**
     * Create the folder
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCreateFolderTest() throws ApiException {
        String path = "My Documents";
        String storage = null;
        String destStorage = null;
        ResponseMessage response = api.PutCreateFolder(path, storage, destStorage);
        assertNotNull(response);
    }

    /**
     * Copy a specific file
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCopyTest() throws ApiException {
        String path = "testfile.txt";
        String newdest = new File("Documents/", "/testfile.txt").getPath();
        String versionId = null;
        String storage = null;
        String destStorage = null;

        ResponseMessage response = api.PutCopy(path, newdest, versionId, storage, destStorage);
        assertNotNull(response);
    }

    /**
     * Copy a folder
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void PutCopyFolderTest() throws ApiException {
        String path = "Word Documents";
        String newdest = new File("Documents/", "/Word Documents").getPath();
        String storage = null;
        String destStorage = null;

        ResponseMessage response = api.PutCopyFolder(path, newdest, storage, destStorage);
        assertNotNull(response);
    }


}
