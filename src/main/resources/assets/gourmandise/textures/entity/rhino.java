// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_hand;
	private final ModelRenderer left_hand;

	public custom_model() {
		textureWidth = 112;
		textureHeight = 80;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.0F, 13.0F, -35.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(-4.0F, -6.0F, 23.0F);
		bone.addChild(body);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(9.0F, 19.0F, 22.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(40, 0).addBox(-18.0F, -22.0F, 10.0F, 18.0F, 27.0F, 17.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-4.0F, -7.0F, 23.0F);
		bone.addChild(head);
		head.setTextureOffset(30, 21).addBox(-6.0F, -7.0F, -13.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(30, 21).addBox(2.0F, -7.0F, -13.0F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -23.0F, 8.0F, 9.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(28, 44).addBox(-6.0F, -5.0F, -11.0F, 12.0F, 12.0F, 11.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, -2.0F, -19.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(28, 2).addBox(-3.0F, -8.0F, 1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -1.0F, -16.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.setTextureOffset(4, 5).addBox(-2.0F, -6.0F, 1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, -9.0F, 46.0F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(0, 21).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, true);
		left_leg.setTextureOffset(0, 43).addBox(-3.0F, 12.0F, -3.0F, 7.0F, 8.0F, 7.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-10.0F, -8.0F, 46.0F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(0, 21).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 43).addBox(-4.0F, 11.0F, -3.0F, 7.0F, 8.0F, 7.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(-10.0F, -9.0F, 26.0F);
		bone.addChild(right_hand);
		right_hand.setTextureOffset(0, 21).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);
		right_hand.setTextureOffset(0, 43).addBox(-4.0F, 12.0F, -3.0F, 7.0F, 8.0F, 7.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(2.0F, -9.0F, 26.0F);
		bone.addChild(left_hand);
		left_hand.setTextureOffset(0, 21).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, true);
		left_hand.setTextureOffset(0, 43).addBox(-3.0F, 12.0F, -3.0F, 7.0F, 8.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}