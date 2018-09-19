package seedu.addressbook.data.person;

public interface Printable {
    final String PRIVATE_PREFIX = "(private) ";

    String getPrintableString();
}
