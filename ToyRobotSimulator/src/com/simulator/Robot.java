package com.simulator;

class Robot {
    Point point;
    Direction direction;

    public void placeMe(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;

        if (isOutOfRange()) {
            throw new RuntimeException("Can't place the robot to this point: "
                    + this.point);
        }
    }

    public void turnLeft() {
        switch (direction) {
        case NORTH:
            direction = Direction.WEST;
            break;
        case WEST:
            direction = Direction.SOUTH;
            break;
        case SOUTH:
            direction = Direction.EAST;
            break;
        case EAST:
            direction = Direction.NORTH;
            break;
        default:
            break;
        }
    }

    public void turnRight() {
        switch (direction) {
        case NORTH:
            direction = Direction.EAST;
            break;
        case WEST:
            direction = Direction.NORTH;
            break;
        case SOUTH:
            direction = Direction.WEST;
            break;
        case EAST:
            direction = Direction.SOUTH;
            break;
        default:
            break;
        }
    }

    public void move() {
        Point moveP = ToyRobot.steps.get(this.direction);
        this.point = this.point.addPoint(moveP);

        if (isOutOfRange()) {
            throw new RuntimeException("Can't move the robot to this point: "
                    + this.point);
        }
    }

    public boolean isOutOfRange() {
        if (this.point.x > TableTop.MAX_WIDTH || this.point.x < 0
                || this.point.y > TableTop.MAX_HEIGHT || this.point.y < 0) {
            return true;
        }

        return false;
    }

    public String report() {
        return "[" + this.point.x + ", " + this.point.y + ", " + this.direction + "]";
    }
}
