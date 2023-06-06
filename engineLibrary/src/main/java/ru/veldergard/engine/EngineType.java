package ru.veldergard.engine;

public class EngineType {
    /**
     * Двигатель на бензиновом моторе.
     */
    public static final EngineType GASOLINE_ENGINE = new EngineType(0.82, 0.85);

    /**
     * Двигатель на форсированном моторе.
     */
    public static final EngineType FORCED_ENGINE = new EngineType(0.9, 0.9);

    /**
     * Двигатель на дизельном моторе.
     */
    public static final EngineType DIESEL_ENGINE = new EngineType(0.9, 2.5);

    /**
     * Минимальное эффективное давление.
     */
    private final double minEffectivePressure;

    /**
     * Максимальное эффективное давление.
     */
    private final double maxEffectivePressure;

    /**
     * Среднее эффективное давление.
     */
    private final double meanEffectivePressure;

    /**
     * @param minEffectivePressure Минимальное эффективное давление.
     * @param maxEffectivePressure Максимальное эффективное давление.
     */
    private EngineType(double minEffectivePressure, double maxEffectivePressure) {
        this.minEffectivePressure = minEffectivePressure;
        this.maxEffectivePressure = maxEffectivePressure;

        meanEffectivePressure = this.minEffectivePressure + this.maxEffectivePressure / 2;
    }

    /**
     * Возвращает минимальное эффективное давление.
     *
     * @return Минимальное эффективное давление.
     */
    public double getMinEffectivePressure() {
        return minEffectivePressure;
    }

    /**
     * Возвращает максимальное эффективное давление.
     *
     * @return Максимальное эффективное давление.
     */
    public double getMaxEffectivePressure() {
        return maxEffectivePressure;
    }

    /**
     * Возвращает среднее эффективное давление.
     *
     * @return Среднее эффективное давление.
     */
    public double getMeanEffectivePressure() {
        return meanEffectivePressure;
    }
}
