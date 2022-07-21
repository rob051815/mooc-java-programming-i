public class ArchiveEntry {
  String identifier, name;

  public ArchiveEntry(String identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }
    if(!(obj instanceof ArchiveEntry)) {
      return false;
    }
    ArchiveEntry entry = (ArchiveEntry) obj;
    return this.identifier.equals(entry.identifier);
  }

  @Override
  public String toString() {
    return this.identifier + ": " + this.name;
  }
}
