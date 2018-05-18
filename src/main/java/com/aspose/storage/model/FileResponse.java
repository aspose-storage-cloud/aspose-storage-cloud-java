package com.aspose.storage.model;
/**
 * FileResponse
 */

public class FileResponse {
  
  private String Name = null;
  private Boolean IsFolder = null;
  private String ModifiedDate = null;
  private Long Size = null;
  private String Path = null;
  private Boolean IsDirectory = null;
    
  /**
   * Get name
   * @return name
  **/
  public String getName() {
    return Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  /**
   * Get isFolder
   * @return isFolder
  **/
  public Boolean getIsIsFolder() {
    return IsFolder;
  }

  public void setIsFolder(Boolean IsFolder) {
    this.IsFolder = IsFolder;
  }
    
  /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  public String getModifiedDate() {
    return ModifiedDate;
  }

  public void setModifiedDate(String ModifiedDate) {
    this.ModifiedDate = ModifiedDate;
  }
    
  /**
   * Get size
   * @return size
  **/
  public Long getSize() {
    return Size;
  }

  public void setSize(Long Size) {
    this.Size = Size;
  }
  
  /**
   * Get path
   * @return path
  **/
  public String getPath() {
    return Path;
  }

  public void setPath(String Path) {
    this.Path = Path;
  }
  
  /**
   * Get isDirectory
   * @return isDirectory
  **/
  public Boolean isIsDirectory() {
    return IsDirectory;
  }

  public void setIsDirectory(Boolean IsDirectory) {
    this.IsDirectory = IsDirectory;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileResponse {\n");
    sb.append("    name: ").append(toIndentedString(Name)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(IsFolder)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(ModifiedDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(Size)).append("\n");
    sb.append("    path: ").append(toIndentedString(Path)).append("\n");
    sb.append("    isDirectory: ").append(toIndentedString(IsDirectory)).append("\n");
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

