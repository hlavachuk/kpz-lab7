package Task4;

/** Стабільний контракт: яку частину вартості покриває страхова. */
public interface CoveragePolicy {
    double coverage(double cost);
}
