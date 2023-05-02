/**
 * DwarfPlanetTester.java - describes bodies in our Solar System which orbit the Sun, meaning that they aren't 
 * moons of other planets) but aren't big enough to be considered planets themselves.
 * Author:     Chris Merrill
 * Module:     3
 * Project:    Lab #2
 * Problem Statement: Create a DwarfPlanetTester class which tracks the
 *  dwarf planet's name, it's discoverer, year of discovery, diameter, and distance. 
 *
 * Algorithm / Overall Plan:
 * 1. Create Dwarf Planet and Tester Class
 * 2. Create 5 properties; name (String), discoverer (String),year of discovery (int),average diameter in km (double)
      and average distance from the Sun in km (long)
 * 3. Create a A "no-arg", a full constructor, all getters and setters, and a toString
 * 4. Set the restriction of the diameter and distance cannot be negative (set to 0 otherwise)
 * and the year of discovery must be between 1800 and 2100 (set to 1800 otherwise)
 * 5. In a separate class, create a  main  method which establishes objects for the first five dwarf planets in the 
 *    table below. Use the no-arg constructor to create two planets, and the full constructor to create the remaining planets:
 * 6. Finally, print a nicely-formatted (columnar) report similar to the table above.
 * 7. Use  printf  statements in the  main  method to determine the spacing for each column (do NOT use toString,
 *    the tab character,or a bunch of spaces.)
 * 8. In main, assign your format string to a variable so that each  printf 
 * statement uses the same format string.
 * 9. Place commas in the distance and diameter numbers when appropriate.
 * 10. Use a single  printf  statement for each planet.
 * 11. Test and run to make sure it all works. 
 */

    public class DwarfPlanetTester {
        public static void main(String[] args)
        {
            // Create no arg constructor for two planets 
            DwarfPlanet ceres = new DwarfPlanet();
            ceres.setName("Ceres");
            ceres.setDiscoverer("Piazzi");
            ceres.setYearOfDiscovery(1801);
            ceres.setDiameter(952.4);
            ceres.setDistance(413700000);    
            
            DwarfPlanet pluto = new DwarfPlanet();
            pluto.setName("Pluto");
            pluto.setDiscoverer("Tombaugh");
            pluto.setYearOfDiscovery(1930);
            pluto.setDiameter(2302.0);
            pluto.setDistance(5874000000L);
            
            // Full constructors
            DwarfPlanet haumea =
                new DwarfPlanet("Haumea","Brown",2004, 1220.0, 6452000000L);
            DwarfPlanet makeMake =
                new DwarfPlanet("Makemake","Brown",2005,1425.0,6850000000L);
            DwarfPlanet eris =
                new DwarfPlanet("Eris","Brown",2003,2321.0,10125000000L);
            
            // Print string from DwarfPlanet class
            System.out.println(ceres);
            System.out.println(pluto);
            System.out.println(haumea);
            System.out.println(makeMake);
            System.out.println(eris);
            
            // Formatting
            System.out.println("Name     Discovered by Year  Diameter(Km)  Distance(Km)");
            String format = "%-8s %-12s %5d %,8.1f %,18d\n" ;
        
            // No arg constructor print out
            System.out.printf(format,ceres.getName(),ceres.getDiscoverer(),
            ceres.getYearOfDiscovery(),ceres.getDiameter(),ceres.getDistance());
            
            System.out.printf(format,pluto.getName(),pluto.getDiscoverer(),
            pluto.getYearOfDiscovery(),pluto.getDiameter(),pluto.getDistance());
            
            System.out.printf(format,haumea.getName(),haumea.getDiscoverer(),
            haumea.getYearOfDiscovery(),haumea.getDiameter(),haumea.getDistance());
            
            System.out.printf(format,makeMake.getName(),makeMake.getDiscoverer(),
            makeMake.getYearOfDiscovery(),makeMake.getDiameter(),makeMake.getDistance());
           
            System.out.printf(format,eris.getName(),eris.getDiscoverer(),
            eris.getYearOfDiscovery(),eris.getDiameter(),eris.getDistance());
        }
}
