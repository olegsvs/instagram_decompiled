package X;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.BitSet;

/* renamed from: X.23u */
public final class AnonymousClass23u {
    /* renamed from: B */
    public static final BitSet f25540B = new BitSet(256);
    /* renamed from: C */
    public static final char[][] f25541C = new char[128][];

    static {
        int i;
        for (i = 97; i <= 122; i++) {
            f25540B.set(i);
        }
        for (i = 65; i <= 90; i++) {
            f25540B.set(i);
        }
        for (i = 48; i <= 57; i++) {
            f25540B.set(i);
        }
        BitSet bitSet = f25540B;
        bitSet.set(32);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        char[][] cArr = f25541C;
        cArr[0] = new char[]{'%', '0', '0'};
        cArr[1] = new char[]{'%', '0', '1'};
        cArr[2] = new char[]{'%', '0', '2'};
        cArr[3] = new char[]{'%', '0', '3'};
        cArr[4] = new char[]{'%', '0', '4'};
        cArr[5] = new char[]{'%', '0', '5'};
        cArr[6] = new char[]{'%', '0', '6'};
        cArr[7] = new char[]{'%', '0', '7'};
        cArr[8] = new char[]{'%', '0', '8'};
        cArr[9] = new char[]{'%', '0', '9'};
        cArr[10] = new char[]{'%', '0', 'A'};
        cArr[11] = new char[]{'%', '0', 'B'};
        cArr[12] = new char[]{'%', '0', 'C'};
        cArr[13] = new char[]{'%', '0', 'D'};
        cArr[14] = new char[]{'%', '0', 'E'};
        cArr[15] = new char[]{'%', '0', 'F'};
        cArr[16] = new char[]{'%', '1', '0'};
        cArr[17] = new char[]{'%', '1', '1'};
        cArr[18] = new char[]{'%', '1', '2'};
        cArr[19] = new char[]{'%', '1', '3'};
        cArr[20] = new char[]{'%', '1', '4'};
        cArr[21] = new char[]{'%', '1', '5'};
        cArr[22] = new char[]{'%', '1', '6'};
        cArr[23] = new char[]{'%', '1', '7'};
        cArr[24] = new char[]{'%', '1', '8'};
        cArr[25] = new char[]{'%', '1', '9'};
        cArr[26] = new char[]{'%', '1', 'A'};
        cArr[27] = new char[]{'%', '1', 'B'};
        cArr[28] = new char[]{'%', '1', 'C'};
        cArr[29] = new char[]{'%', '1', 'D'};
        cArr[30] = new char[]{'%', '1', 'E'};
        cArr[31] = new char[]{'%', '1', 'F'};
        cArr[32] = new char[]{'+'};
        cArr[33] = new char[]{'%', '2', '1'};
        cArr[34] = new char[]{'%', '2', '2'};
        cArr[35] = new char[]{'%', '2', '3'};
        cArr[36] = new char[]{'%', '2', '4'};
        cArr[37] = new char[]{'%', '2', '5'};
        cArr[38] = new char[]{'%', '2', '6'};
        cArr[39] = new char[]{'%', '2', '7'};
        cArr[40] = new char[]{'%', '2', '8'};
        cArr[41] = new char[]{'%', '2', '9'};
        cArr[42] = new char[]{'*'};
        cArr[43] = new char[]{'%', '2', 'B'};
        cArr[44] = new char[]{'%', '2', 'C'};
        cArr[45] = new char[]{'-'};
        cArr[46] = new char[]{'.'};
        cArr[47] = new char[]{'%', '2', 'F'};
        cArr[48] = new char[]{'0'};
        cArr[49] = new char[]{'1'};
        cArr[50] = new char[]{'2'};
        cArr[51] = new char[]{'3'};
        cArr[52] = new char[]{'4'};
        cArr[53] = new char[]{'5'};
        cArr[54] = new char[]{'6'};
        cArr[55] = new char[]{'7'};
        cArr[56] = new char[]{'8'};
        cArr[57] = new char[]{'9'};
        cArr[58] = new char[]{'%', '3', 'A'};
        cArr[59] = new char[]{'%', '3', 'B'};
        cArr[60] = new char[]{'%', '3', 'C'};
        cArr[61] = new char[]{'%', '3', 'D'};
        cArr[62] = new char[]{'%', '3', 'E'};
        cArr[63] = new char[]{'%', '3', 'F'};
        cArr[64] = new char[]{'%', '4', '0'};
        cArr[65] = new char[]{'A'};
        cArr[66] = new char[]{'B'};
        cArr[67] = new char[]{'C'};
        cArr[68] = new char[]{'D'};
        cArr[69] = new char[]{'E'};
        cArr[70] = new char[]{'F'};
        cArr[71] = new char[]{'G'};
        cArr[72] = new char[]{'H'};
        cArr[73] = new char[]{'I'};
        cArr[74] = new char[]{'J'};
        cArr[75] = new char[]{'K'};
        cArr[76] = new char[]{'L'};
        cArr[77] = new char[]{'M'};
        cArr[78] = new char[]{'N'};
        cArr[79] = new char[]{'O'};
        cArr[80] = new char[]{'P'};
        cArr[81] = new char[]{'Q'};
        cArr[82] = new char[]{'R'};
        cArr[83] = new char[]{'S'};
        cArr[84] = new char[]{'T'};
        cArr[85] = new char[]{'U'};
        cArr[86] = new char[]{'V'};
        cArr[87] = new char[]{'W'};
        cArr[88] = new char[]{'X'};
        cArr[89] = new char[]{'Y'};
        cArr[90] = new char[]{'Z'};
        cArr[91] = new char[]{'%', '5', 'B'};
        cArr[92] = new char[]{'%', '5', 'C'};
        cArr[93] = new char[]{'%', '5', 'D'};
        cArr[94] = new char[]{'%', '5', 'E'};
        cArr[95] = new char[]{'_'};
        cArr[96] = new char[]{'%', '6', '0'};
        cArr[97] = new char[]{'a'};
        cArr[98] = new char[]{'b'};
        cArr[99] = new char[]{'c'};
        cArr[100] = new char[]{'d'};
        cArr[101] = new char[]{'e'};
        cArr[ParserMinimalBase.INT_f] = new char[]{'f'};
        cArr[103] = new char[]{'g'};
        cArr[104] = new char[]{'h'};
        cArr[105] = new char[]{'i'};
        cArr[106] = new char[]{'j'};
        cArr[107] = new char[]{'k'};
        cArr[108] = new char[]{'l'};
        cArr[109] = new char[]{'m'};
        cArr[ParserMinimalBase.INT_n] = new char[]{'n'};
        cArr[111] = new char[]{'o'};
        cArr[112] = new char[]{'p'};
        cArr[113] = new char[]{'q'};
        cArr[ParserMinimalBase.INT_r] = new char[]{'r'};
        cArr[115] = new char[]{'s'};
        cArr[ParserMinimalBase.INT_t] = new char[]{'t'};
        cArr[ParserMinimalBase.INT_u] = new char[]{'u'};
        cArr[118] = new char[]{'v'};
        cArr[119] = new char[]{'w'};
        cArr[120] = new char[]{'x'};
        cArr[121] = new char[]{'y'};
        cArr[122] = new char[]{'z'};
        cArr[ParserMinimalBase.INT_LCURLY] = new char[]{'%', '7', 'B'};
        cArr[124] = new char[]{'%', '7', 'C'};
        cArr[ParserMinimalBase.INT_RCURLY] = new char[]{'%', '7', 'D'};
        cArr[126] = new char[]{'%', '7', 'E'};
        cArr[127] = new char[]{'%', '7', 'F'};
    }
}
