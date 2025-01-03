package emu.grasscutter.game.home;

import lombok.Getter;

@Getter
public enum SpecialFurnitureType {
    NOT_SPECIAL(-1),
    FarmField(2),
    TeleportPoint(3),
    NPC(5),
    Apartment(6),
    FurnitureSuite(7),
    Paimon(8),
    BlockDependent(9),
    Fishpond(10),
    Fish(11),
    CustomBaseFurnitrue(12),
    CustomNodeFurnitrue(13),
    GroupFurnitrue(14),
    VirtualFurnitrue(15),
    CoopPictureFrame(16),
    ChangeBgmFurniture(17),
    ServerGadget(18),
    Fishtank(19);

    private final int value;

    SpecialFurnitureType(int value) {
        this.value = value;
    }
}
