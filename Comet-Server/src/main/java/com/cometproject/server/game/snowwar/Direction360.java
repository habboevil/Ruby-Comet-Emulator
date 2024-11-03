package com.cometproject.server.game.snowwar;

/*
 * ****************
 * @author capos *
 * ****************
 */

public class Direction360 {
    public static int N = 0;
    public static int NE = 45;
    public static int E = 90;
    public static int SE = 135;
    public static int S = 180;
    public static int SW = 225;
    public static int W = 270;
    public static int NW = 315;

    private static final int[][] _4G = new int[][]{{0, 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 48, 53, 57, 61, 66, 70, 74, 79, 83, 87, 91, 95, 100, 104, 108, 112, 116, 120, 124, 127, 131, 135, 139, 143, 146, 150, 154, 157, 161, 164, 167, 171, 174, 177, 181, 184, 187, 190, 193, 196, 198, 201, 204, 207, 209, 212, 214, 217, 219, 221, 223, 226, 228, 230, 232, 233, 235, 237, 238, 240, 242, 243, 244, 246, 247, 248, 249, 250, 251, 252, 252, 253, 254, 254, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x0100, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 254, 254, 253, 252, 252, 251, 250, 249, 248, 247, 246, 244, 243, 242, 240, 238, 237, 235, 233, 232, 230, 228, 226, 223, 221, 219, 217, 214, 212, 209, 207, 204, 201, 198, 196, 193, 190, 187, 184, 181, 177, 174, 171, 167, 164, 161, 157, 154, 150, 146, 143, 139, 135, 131, 127, 124, 120, 116, 112, 108, 104, 100, 95, 91, 87, 83, 79, 74, 70, 66, 61, 57, 53, 48, 44, 40, 35, 31, 26, 22, 17, 13, 8, 4, 0, -4, -8, -13, -17, -22, -26, -31, -35, -40, -44, -48, -53, -57, -61, -66, -70, -74, -79, -83, -87, -91, -95, -100, -104, -108, -112, -116, -120, -124, -128, -131, -135, -139, -143, -146, -150, -154, -157, -161, -164, -167, -171, -174, -177, -181, -184, -187, -190, -193, -196, -198, -201, -204, -207, -209, -212, -214, -217, -219, -221, -223, -226, -228, -230, -232, -233, -235, -237, -238, -240, -242, -243, -244, -246, -247, -248, -249, -250, -251, -252, -252, -253, -254, -254, -255, -255, -255, -255, -255, -256, -255, -255, -255, -255, -255, -254, -254, -253, -252, -252, -251, -250, -249, -248, -247, -246, -244, -243, -242, -240, -238, -237, -235, -233, -232, -230, -228, -226, -223, -221, -219, -217, -214, -212, -209, -207, -204, -201, -198, -196, -193, -190, -187, -184, -181, -177, -174, -171, -167, -164, -161, -157, -154, -150, -146, -143, -139, -135, -131, -128, -124, -120, -116, -112, -108, -104, -100, -95, -91, -87, -83, -79, -74, -70, -66, -61, -57, -53, -48, -44, -40, -35, -31, -26, -22, -17, -13, -8, -4}, {-256, -255, -255, -255, -255, -255, -254, -254, -253, -252, -252, -251, -250, -249, -248, -247, -246, -244, -243, -242, -240, -238, -237, -235, -233, -232, -230, -228, -226, -223, -221, -219, -217, -214, -212, -209, -207, -204, -201, -198, -196, -193, -190, -187, -184, -181, -177, -174, -171, -167, -164, -161, -157, -154, -150, -146, -143, -139, -135, -131, -128, -124, -120, -116, -112, -108, -104, -100, -95, -91, -87, -83, -79, -74, -70, -66, -61, -57, -53, -48, -44, -40, -35, -31, -26, -22, -17, -13, -8, -4, 0, 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 48, 53, 57, 61, 66, 70, 74, 79, 83, 87, 91, 95, 100, 104, 108, 112, 116, 120, 124, 127, 131, 135, 139, 143, 146, 150, 154, 157, 161, 164, 167, 171, 174, 177, 181, 184, 187, 190, 193, 196, 198, 201, 204, 207, 209, 212, 214, 217, 219, 221, 223, 226, 228, 230, 232, 233, 235, 237, 238, 240, 242, 243, 244, 246, 247, 248, 249, 250, 251, 252, 252, 253, 254, 254, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 0x0100, 0xFF, 0xFF, 0xFF, 0xFF, 0xFF, 254, 254, 253, 252, 252, 251, 250, 249, 248, 247, 246, 244, 243, 242, 240, 238, 237, 235, 233, 232, 230, 228, 226, 223, 221, 219, 217, 214, 212, 209, 207, 204, 201, 198, 196, 193, 190, 187, 184, 181, 177, 174, 171, 167, 164, 161, 157, 154, 150, 146, 143, 139, 135, 131, 128, 124, 120, 116, 112, 108, 104, 100, 95, 91, 87, 83, 79, 74, 70, 66, 61, 57, 53, 48, 44, 40, 35, 31, 26, 22, 17, 13, 8, 4, 0, -4, -8, -13, -17, -22, -26, -31, -35, -40, -44, -48, -53, -57, -61, -66, -70, -74, -79, -83, -87, -91, -95, -100, -104, -108, -112, -116, -120, -124, -128, -131, -135, -139, -143, -146, -150, -154, -157, -161, -164, -167, -171, -174, -177, -181, -184, -187, -190, -193, -196, -198, -201, -204, -207, -209, -212, -214, -217, -219, -221, -223, -226, -228, -230, -232, -233, -235, -237, -238, -240, -242, -243, -244, -246, -247, -248, -249, -250, -251, -252, -252, -253, -254, -254, -255, -255, -255, -255, -255}};
    private static final int[] _1MD = new int[]{0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 30, 30, 30, 30, 30, 30, 31, 31, 31, 31, 31, 31, 32, 32, 32, 32, 32, 32, 33, 33, 33, 33, 33, 33, 34, 34, 34, 34, 34, 34, 34, 35, 35, 35, 35, 35, 35, 36, 36, 36, 36, 36, 36, 36, 37, 37, 37, 37, 37, 37, 37, 38, 38, 38, 38, 38, 38, 38, 39, 39, 39, 39, 39, 39, 39, 39, 40, 40, 40, 40, 40, 40, 40, 41, 41, 41, 41, 41, 41, 41, 41, 42, 42, 42, 42, 42, 42, 42, 42, 43, 43, 43, 43, 43, 43, 43, 43, 44, 44, 44, 44, 44, 44, 44, 44, 44, 45, 45, 45, 45, 45};

    private int _4XG = 0;
    private boolean _3zG = false;

    public Direction360(int _arg1){
        super();
        _4XG = _arg1;
    }
    public static int validateDirection360Value(int _arg1){
        if (_arg1 > 359){
            _arg1 = (_arg1 % 360);
        } else {
            if (_arg1 < 0){
                _arg1 = (360 + (_arg1 % 360));
            }
        }
        return (_arg1);
    }
    public static Direction8 direction360ValueToDirection8(int _arg1){
        return (Direction8.getDirection(Direction8.validateDirection8Value((MathUtil._43Z((validateDirection360Value((_arg1 - 22)) / 45)) + 1))));
    }
    public static int direction8ToDirection360Value(Direction8 _arg1){
        switch (_arg1.getRot()){
            case 0:
                return (Direction360.N);
            case 1:
                return (Direction360.NE);
            case 2:
                return (Direction360.E);
            case 3:
                return (Direction360.SE);
            case 4:
                return (Direction360.S);
            case 5:
                return (Direction360.SW);
            case 6:
                return (Direction360.W);
            case 7:
                return (Direction360.NW);
        }
        return (-1);
    }
    public static int _0uc(int _arg1){
        _arg1 = validateDirection360Value(_arg1);
        return (_4G[0][_arg1]);
    }
    public static int _17x(int _arg1){
        _arg1 = validateDirection360Value(_arg1);
        return (_4G[1][_arg1]);
    }
    public static int getRot(int deltaX, int deltaY){
        int local2;
        if (_1xd(deltaX) <= _1xd(deltaY)){
            if (deltaY == 0){
                deltaY = 1;
            }
            deltaX = (deltaX * 0x0100);
            local2 = MathUtil._43Z((deltaX / deltaY));
            if (local2 < 0){
                local2 = -(local2);
            }
            if (local2 > 0xFF){
                local2 = 0xFF;
            }
            if (deltaY < 0){
                if (deltaX > 0){
                    return (_1MD[local2]);
                }
                return ((360 - _1MD[local2]));
            }
            if (deltaX > 0){
                return ((180 - _1MD[local2]));
            }
            return ((180 + _1MD[local2]));
        }
        if (deltaX == 0){
            deltaX = 1;
        }
        deltaY = (deltaY * 0x0100);
        local2 = MathUtil._43Z((deltaY / deltaX));
        if (local2 < 0){
            local2 = -(local2);
        }
        if (local2 > 0xFF){
            local2 = 0xFF;
        }
        if (deltaY < 0){
            if (deltaX > 0){
                return ((90 - _1MD[local2]));
            }
            return ((270 + _1MD[local2]));
        }
        if (deltaX > 0){
            return ((90 + _1MD[local2]));
        }
        return ((270 - _1MD[local2]));
    }
    public static int _1xd(int _arg1){
        if (_arg1 < 0){
            return (-(_arg1));
        }
        return (_arg1);
    }

    public void dispose(){
        _3zG = true;
    }
    public boolean disposed(){
        return (_3zG);
    }
    public int _2Hq(){
        return (_4XG);
    }
    public void _1ji(int _arg1){
        _4XG = validateDirection360Value(_arg1);
    }
    public void _0JV(int _arg1){
        _4XG = (_4XG + _arg1);
        _4XG = validateDirection360Value(_4XG);
    }
    @Override
    public String toString(){
        return ((("[" + _4XG) + "]"));
    }
    public Direction8 direction8Value(){
        return (direction360ValueToDirection8(_4XG));
    }
    public int _0uc(){
        return (_4G[0][_4XG]);
    }
    public int _17x(){
        return (_4G[1][_4XG]);
    }
}
