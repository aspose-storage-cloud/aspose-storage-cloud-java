package com.aspose.storage.model;

import com.aspose.storage.model.FileResponse;

import java.util.ArrayList;
import java.util.List;
/**
 * FilesResponse
 */

public class FilesResponse {
  
  private List<FileResponse> Files = null;
  private String Code = null;
  private String Status = null;
  
  public FilesResponse addFilesItem(FileResponse filesItem) {
    if (this.Files == null) {
      this.Files = new ArrayList<FileResponse>();
    }
    this.Files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  public List<FileResponse> getFiles() {
    return Files;
  }

  public void setFiles(List<FileResponse> files) {
    this.Files = files;
  }

  /**
   * getCode
   * Gets String
   * @return Code
   */
  public String getCode() {
      return Code;
  }
  
  /**
   * setCode
   * Sets String
   * @param Code String
   */
  public void setCode(String Code) {
      this.Code = Code;
  }
  
  /**
   * getStatus
   * Gets String
   * @return Status
   */
  public String getStatus() {
      return Status;
  }
  
  /**
   * setStatus
   * Sets String
   * @param Status String
   */
  public void setStatus(String Status) {
      this.Status = Status;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    Files: ").append(toIndentedString(Files)).append("\n");
    sb.append("    Code: ").append(toIndentedString(Code)).append("\n");
    sb.append("    Status: ").append(toIndentedString(Status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

