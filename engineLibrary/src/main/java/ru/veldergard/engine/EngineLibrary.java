package ru.veldergard.engine;

public class EngineLibrary {
    /**
     * Считает рабочий объем.
     *
     * @param cylinderDiameter Диаметр цилиндра, см.
     * @param pistonStroke     Ход поршня, см.
     * @return Рабочий объем, см^2.
     */
    public static double calculateWorkingVolume(double cylinderDiameter, double pistonStroke) {
        return Math.PI * Math.pow(cylinderDiameter, 2) * pistonStroke;
    }

    /**
     * Считает мощность двигателя.
     *
     * @param engineCapacity    Объем двигателя, см^3.
     * @param rotationFrequency Частота вращения, об/мин.
     * @param engineType        Тип топлива для двигателя.
     * @return Мощность двигателя.
     */
    public static double calculateEnginePower(double engineCapacity, double rotationFrequency, EngineType engineType) {
        return engineCapacity * rotationFrequency * engineType.getMeanEffectivePressure() / 120;
    }

    /**
     * Считает мощность двигателя.
     *
     * @param engineTorque    Крутящий момент, Нм.
     * @param crankshaftSpeed Обороты коленчатого вала, об/мин.
     * @return Мощность двигателя, кВт.
     */
    public static double calculateEnginePower(double engineTorque, double crankshaftSpeed) {
        return engineTorque * crankshaftSpeed / 9549;
    }

    /**
     * Конвертирует мощность из кВт в лошадиные силы.
     *
     * @param enginePower Мощность двигателя, кВт.
     * @return Мощность двигателя, ЛС.
     */
    public static double convertEnginePowerToHorsepower(double enginePower) {
        return enginePower / 0.735;
    }

    /**
     * Считает крутящий момент.
     *
     * @param engineDisplacement                       Рабочий объем двигателя, л.
     * @param meanEffectivePressureInCombustionChamber Среднее эффективное давление в камере сгорания, бар.
     * @return Крутящий момент, Нм.
     */
    public static double calculateEngineTorque(double engineDisplacement, double meanEffectivePressureInCombustionChamber) {
        return engineDisplacement * meanEffectivePressureInCombustionChamber / 0.12566;
    }

    /**
     * Считает литровую мощность.
     *
     * @param effectivePower    Эффективная мощность.
     * @param numberOfCylinders Число цилиндров.
     * @param engineCapacity    Литраж двигателя.
     * @return Литровая мощность.
     */
    public static double calcLiterPower(double effectivePower, double numberOfCylinders,
                                        double engineCapacity) {
        return effectivePower / (numberOfCylinders * engineCapacity);
    }

    /**
     * Считает литраж двигателя.
     *
     * @param cylinderDiameter Диаметр цилиндра.
     * @param pistonStroke     Ход поршня.
     * @return Литраж двигателя.
     */
    public static double calculateEngineCapacity(double cylinderDiameter, double pistonStroke) {
        return (Math.PI / 4) * cylinderDiameter * pistonStroke;
    }

    /**
     * Считает среднее эффективное давление на поршень.
     *
     * @param effectivePower    Эффективная мощность.
     * @param engineCapacity    Литраж двигателя.
     * @param numberOfCylinders Число цилиндров.
     * @param rotationFrequency Частота вращения.
     * @param i                 Количество оборотов.
     * @return Среднее эффективное давление на поршень.
     */
    public static double calculateAverageEffectivePressureOnThePiston(double effectivePower, double engineCapacity,
                                                                      double numberOfCylinders,
                                                                      double rotationFrequency, double i) {
        return effectivePower / (engineCapacity * numberOfCylinders * rotationFrequency * i);
    }
}
