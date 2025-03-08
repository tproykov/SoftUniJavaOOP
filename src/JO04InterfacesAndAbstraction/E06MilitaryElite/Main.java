package JO04InterfacesAndAbstraction.E06MilitaryElite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Private> privatesById = new HashMap<>();
        List<Soldier> soldiers = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];

            switch (type) {
                case "Private":
                    int id = Integer.parseInt(tokens[1]);
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);

                    Private priv = new PrivateImpl(id, firstName, lastName, salary);
                    soldiers.add(priv);
                    privatesById.put(id, priv);
                    break;

                case "LieutenantGeneral":
                    id = Integer.parseInt(tokens[1]);
                    firstName = tokens[2];
                    lastName = tokens[3];
                    salary = Double.parseDouble(tokens[4]);

                    LieutenantGeneral lieutenant = new LieutenantGeneralImpl(id, firstName, lastName, salary);

                    for (int i = 5; i < tokens.length; i++) {
                        int privateId = Integer.parseInt(tokens[i]);
                        if (privatesById.containsKey(privateId)) {
                            lieutenant.addPrivate(privatesById.get(privateId));
                        }
                    }

                    soldiers.add(lieutenant);
                    privatesById.put(id, (Private) lieutenant);
                    break;

                case "Engineer":
                    id = Integer.parseInt(tokens[1]);
                    firstName = tokens[2];
                    lastName = tokens[3];
                    salary = Double.parseDouble(tokens[4]);
                    String corps = tokens[5];

                    try {
                        Engineer engineer = new EngineerImpl(id, firstName, lastName, salary, corps);

                        for (int i = 6; i < tokens.length; i += 2) {
                            if (i + 1 < tokens.length) {
                                String partName = tokens[i];
                                int hoursWorked = Integer.parseInt(tokens[i + 1]);
                                Repair repair = new Repair(partName, hoursWorked);
                                engineer.addRepair(repair);
                            }
                        }

                        soldiers.add(engineer);
                        privatesById.put(id, (Private) engineer);
                    } catch (IllegalArgumentException e) {
                        // Skip invalid corps
                    }
                    break;

                case "Commando":
                    id = Integer.parseInt(tokens[1]);
                    firstName = tokens[2];
                    lastName = tokens[3];
                    salary = Double.parseDouble(tokens[4]);
                    corps = tokens[5];

                    try {
                        Commando commando = new CommandoImpl(id, firstName, lastName, salary, corps);

                        for (int i = 6; i < tokens.length; i += 2) {
                            if (i + 1 < tokens.length) {
                                String codeName = tokens[i];
                                String state = tokens[i + 1];
                                Mission mission = new Mission(codeName, state);
                                if (State.fromString(state) != null) {
                                    commando.addMission(mission);
                                }
                            }
                        }

                        soldiers.add(commando);
                        privatesById.put(id, (Private) commando);
                    } catch (IllegalArgumentException e) {
                        // Skip invalid corps
                    }
                    break;

                case "Spy":
                    id = Integer.parseInt(tokens[1]);
                    firstName = tokens[2];
                    lastName = tokens[3];
                    String codeNumber = tokens[4];

                    Spy spy = new SpyImpl(id, firstName, lastName, codeNumber);
                    soldiers.add(spy);
                    break;
            }
        }

        for (Soldier soldier : soldiers) {
            System.out.println(soldier);
        }
    }
}