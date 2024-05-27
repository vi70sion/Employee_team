Sukurti Java programą, kuri:
Turėtų bazinę klasę Employee su savybėmis Name, Age ir Salary, bei metodą Work().
Sukurtų dvi paveldėtas klases: Manager ir Developer.
Manager klasė turi turėti papildomą savybę TeamSize ir perrašytą metodą Work().
Developer klasė turi turėti papildomą savybę ProgrammingLanguage ir perrašytą metodą Work().
Sukurtų sąrašą Employee objektų, kuriame būtų tiek Manager, tiek Developer objektai.
Naudotų ciklą, kuris iteruoja per sąrašą ir patikrina objektų tipus naudojant operatorių kuris paima objekto tipą.
Naudotų sudėtingesnes sąlygas objektų apdorojimui:
Jei objektas yra Manager, patikrinkite jo TeamSize. Jei komandos dydis didesnis nei 10, išveskite pranešimą, kad valdo didelę komandą, kitu atveju - kad valdo mažą komandą.
Jei objektas yra Developer, patikrinkite jo ProgrammingLanguage. Jei programavimo kalba yra "C#", išveskite pranešimą, kad yra C# programuotojas su nurodyta alga. Jei programavimo kalba yra "Java", išveskite pranešimą, kad yra Java programuotojas su nurodyta alga. 
Kitu atveju, išveskite pranešimą apie kitą programavimo kalbą su nurodyta alga.

Sukurti sąsają:
Sukurkite sąsają EmployeeService su šiais metodais:
void performDuties(Employee employee);
String getEmployeeInfo(Employee employee);
Implementuoti sąsają:

Sukurkite klasę EmployeeServiceImpl, kuri įgyvendins sąsają EmployeeService.
performDuties(Employee employee) metode:
Jei employee yra Manager:
Patikrinkite TeamSize. Jei komandos dydis didesnis nei 10, išveskite pranešimą, kad valdo didelę komandą, kitu atveju - kad valdo mažą komandą.
Jei employee yra Developer:
Patikrinkite ProgrammingLanguage. Jei programavimo kalba yra "C#", išveskite pranešimą, kad yra C# programuotojas su nurodyta alga. Jei programavimo kalba yra "Java", išveskite pranešimą, kad yra Java programuotojas su nurodyta alga. Kitu atveju, išveskite pranešimą apie kitą programavimo kalbą su nurodyta alga.
getEmployeeInfo(Employee employee) metode:
Grąžinkite informaciją apie darbuotoją kaip String (pvz., "Name: John, Age: 30, Salary: 5000").

Panaudoti sąsają:
Sukurkite sąrašą Employee objektų, kuriame būtų tiek Manager, tiek Developer objektai.
Sukurkite EmployeeService objektą.
Naudokite ciklą, kuris iteruoja per sąrašą:
Kiekvienam Employee objekte:
Kviečiant EmployeeService.getEmployeeInfo(Employee employee) metodą, išveskite informaciją apie darbuotoją.
Kviečiant EmployeeService.performDuties(Employee employee) metodą, atlikite atitinkamus veiksmus pagal darbuotojo tipą.

Sukurkite metodą promoteEmployee(Employee employee) sąsajos EmployeeService , kuris priimtų Employee objektą ir pakeistų jo pareigas arba padidintų atlyginimą.
promoteEmployee(Employee employee) metodas turi būti įgyvendintas klasėje EmployeeService. Jis turi tikrinti darbuotojo tipą ir priklausomai nuo to atlikti veiksmus:
Jei employee yra Manager:
Padidinkite TeamSize vienetu.
Jei TeamSize tampa didesnis nei 15, padidinkite Salary 10%.
Jei employee yra Developer:
Jei programavimo kalba yra "Java", padidinkite Salary 12%.
Jei programavimo kalba yra "C#", padidinkite Salary 7%.
Pridėkite galimybę pakeisti darbuotojo pavadinimą (Name) ir amžių (Age). Sukurkite atitinkamus metodus sąsajoje EmployeeService ir implementuokite juos klasėje EmployeeService.
Papildomos sąlygos:
Sukurkite metodą fireEmployee(Employee employee) sąsajos EmployeeServiceImpl, kuris priimtų Employee objektą ir pašalintų jį iš sąrašo.
fireEmployee(Employee employee) metodas turi būti įgyvendintas klasėje EmployeeService. Jis turi pašalinti darbuotoją iš sąrašo.

Metodas calculateBonus(Employee employee):
Sukurkite metodą calculateBonus(Employee employee), kuris apskaičiuotų ir grąžintų darbuotojo premiją (double). Premija turėtų būti apskaičiuota pagal šiuos kriterijus:
Jei employee yra Manager, premija yra 10% jo atlyginimo.
Jei employee yra Developer, premija yra 5% jo atlyginimo.
Kitiems darbuotojams premija yra 3% atlyginimo.

Metodas evaluatePerformance(Employee employee, int performanceScore):
Sukurkite metodą evaluatePerformance(Employee employee, int performanceScore), kuris įvertins darbuotojo veiklą pagal pateiktą veiklos balą (nuo 1 iki 10). Priklausomai nuo balo:
Jei balas yra 9 arba 10, padidinkite atlyginimą 10%.
Jei balas yra 7 arba 8, padidinkite atlyginimą 5%.
Jei balas yra mažesnis nei 7, išveskite pranešimą, kad darbuotojo veikla yra nepatenkinama.
Metodas transferDepartment(Employee employee, String newDepartment):

Sukurkite metodą transferDepartment(Employee employee, String newDepartment), kuris pakeis darbuotojo skyrių. Metodas turėtų priimti naujojo skyriaus pavadinimą ir priskirti jį darbuotojui.
Metodas listAllEmployees(List<Employee> employees):

Sukurkite metodą listAllEmployees(List<Employee> employees), kuris išves visų darbuotojų sąrašą su jų informacija (Name, Age, Salary, ir specifines savybes, pvz., TeamSize arba ProgrammingLanguage).
Metodas findEmployeeByName(List<Employee> employees, String name):

Sukurkite metodą findEmployeeByName(List<Employee> employees, String name), kuris suras ir grąžins darbuotoją pagal vardą. Jei toks darbuotojas nerastas, grąžinkite null.
