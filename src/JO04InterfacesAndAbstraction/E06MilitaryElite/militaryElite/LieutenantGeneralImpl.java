package militaryElite;

import java.util.Set;
import java.util.TreeSet;

class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new TreeSet<>((p1, p2) -> Integer.compare(p2.getId(), p1.getId()));
    }

    @Override
    public void addPrivate(Private priv) {
        privates.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",
                getFirstName(), getLastName(), getId(), getSalary()));

        if (!privates.isEmpty()) {
            sb.append(System.lineSeparator()).append("Privates:");
            for (Private priv : privates) {
                sb.append(System.lineSeparator()).append("  ").append(priv.toString());
            }
        }

        return sb.toString();
    }
}
