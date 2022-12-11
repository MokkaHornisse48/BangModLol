package mod.milog.theonetest.client.renderer;// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import mod.milog.theonetest.entitys.DodoEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


//@OnlyIn(Dist.CLIENT)
public class Dodo_model<D extends DodoEntity> extends EntityModel<DodoEntity> {
	private final ModelRenderer bone;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightwing;
	private final ModelRenderer leftwing;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Dodo_model() {
		int textureWidth = 64;
		int textureHeight = 64;

		bone = new ModelRenderer(this);
		setRotationAngle(bone,0.0F,1.57F,0.0F);
		bone.setTextureSize(textureWidth,textureHeight);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);


		Tail = new ModelRenderer(this);
		Tail.setTextureSize(textureWidth,textureHeight);
		Tail.setRotationPoint(-7.0F, -18.0F, 0.0F);
		bone.addChild(Tail);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setTextureSize(textureWidth,textureHeight);
		cube_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.6109F);
		cube_r1.setTextureOffset(0, 20).addBox(-6.0F, -5.0F, -3.0F, 10.0F, 9.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setTextureSize(textureWidth,textureHeight);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(body);
		body.setTextureOffset(0, 0).addBox(-9.0F, -18.0F, -5.0F, 14.0F, 10.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-9.0F, -19.0F, -5.0F, 14.0F, 1.0F, 10.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setTextureSize(textureWidth,textureHeight);
		rightleg.setRotationPoint(0.0F, -13.0F, 4.0F);
		bone.addChild(rightleg);
		rightleg.setTextureOffset(0, 43).addBox(-2.0F, 2.0F, -1.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		rightleg.setTextureOffset(48, 8).addBox(0.0F, 12.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		rightleg.setTextureOffset(0, 0).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setTextureSize(textureWidth,textureHeight);
		leftleg.setRotationPoint(0.0F, -13.0F, -4.0F);
		bone.addChild(leftleg);
		leftleg.setTextureOffset(48, 13).addBox(0.0F, 12.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		leftleg.setTextureOffset(44, 49).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		leftleg.setTextureOffset(44, 27).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		rightwing = new ModelRenderer(this);
		rightwing.setTextureSize(textureWidth,textureHeight);
		rightwing.setRotationPoint(1.0F, -17.0F, 6.0F);
		bone.addChild(rightwing);
		rightwing.setTextureOffset(0, 35).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 6.0F, 2.0F, 0.0F, false);

		leftwing = new ModelRenderer(this);
		leftwing.setTextureSize(textureWidth,textureHeight);
		leftwing.setRotationPoint(1.0F, -17.0F, -6.0F);
		bone.addChild(leftwing);
		leftwing.setTextureOffset(38, 0).addBox(-7.0F, -1.0F, -1.0F, 8.0F, 6.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setTextureSize(textureWidth,textureHeight);
		Head.setRotationPoint(5.0F, -26.0F, 0.0F);
		bone.addChild(Head);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setTextureSize(textureWidth,textureHeight);
		cube_r2.setRotationPoint(1.0F, 7.0F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2618F);
		cube_r2.setTextureOffset(30, 41).addBox(-0.9F, -8.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setTextureSize(textureWidth,textureHeight);
		cube_r3.setRotationPoint(-14.0F, 28.0F, 2.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.setTextureOffset(16, 39).addBox(5.0F, -26.0F, -4.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setTextureSize(textureWidth,textureHeight);
		head2.setRotationPoint(1.0F, 0.0F, 0.0F);
		Head.addChild(head2);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setTextureSize(textureWidth,textureHeight);
		cube_r4.setRotationPoint(-1.0F, 0.0F, 0.0F);
		head2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.0873F);
		cube_r4.setTextureOffset(26, 29).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setTextureSize(textureWidth,textureHeight);
		cube_r5.setRotationPoint(1.0F, 1.0F, -1.0F);
		head2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0873F);
		cube_r5.setTextureOffset(44, 41).addBox(7.0F, 0.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(32, 20).addBox(1.0F, -3.0F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(DodoEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float hr = netHeadYaw * ((float)Math.PI / 180F);
		//Minecraft.getInstance().player.sendChatMessage(String.valueOf(hr));
		/*
		if(Math.abs(hr)<0.87266F){
			this.head2.rotateAngleY = hr;
		}else{
			this.head2.rotateAngleY = ((hr>0)?0.87266F:-0.87266F);
			this.Head.rotateAngleY = hr + ((hr>0)?-0.87266F:0.87266F);
		}*/

		float hr2 = (hr-this.Head.rotateAngleY)/10;

		if(Math.abs(hr2)<0.1745F){
			this.Head.rotateAngleY += hr2;
		}
		this.head2.rotateAngleY = hr-this.Head.rotateAngleY;

		this.head2.rotateAngleZ = headPitch * ((float)Math.PI / 180F);

		this.rightleg.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftleg.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

		float f = MathHelper.lerp(ageInTicks, entityIn.oFlap, entityIn.wingRotation);
		float f1 = MathHelper.lerp(ageInTicks, entityIn.oFlapSpeed, entityIn.destPos);
		float f2 =  (MathHelper.sin(f) + 1.0F) * f1;

		this.Head.rotateAngleZ = 0;
		this.rightwing.rotateAngleX = f2;
		this.leftwing.rotateAngleX = -f2;

		try {
			if(entityIn.getCustomName().getString().equals("MokkaHornisse48")){
				//this.Head.rotateAngleZ = ageInTicks;
				this.rightwing.rotateAngleZ = ageInTicks;
				this.leftwing.rotateAngleZ = -ageInTicks;
			}
		}catch(NullPointerException e){}


		/*
		this.bill.rotateAngleX = this.head.rotateAngleX;
		this.bill.rotateAngleY = this.head.rotateAngleY;
		this.chin.rotateAngleX = this.head.rotateAngleX;
		this.chin.rotateAngleY = this.head.rotateAngleY;
		this.body.rotateAngleX = ((float)Math.PI / 2F);
		this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.rightWing.rotateAngleZ = ageInTicks;
		this.leftWing.rotateAngleZ = -ageInTicks;*/
	}


	/*
	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}*/

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		/*
		if(rgb){
			int i1 = 25;
			int i = (int) (ages / 10);
			int j = DyeColor.values().length;
			int k = i % j;
			int l = (i + 1) % j;
			float f3 = ages;
			float[] afloat1 = SheepEntity.getDyeRgb(DyeColor.byId(k));
			float[] afloat2 = SheepEntity.getDyeRgb(DyeColor.byId(l));
			red = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
			green = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
			blue = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
		}*/
		bone.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}

	public void render(DodoEntity entityIn,MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha,float partialTicks) {
		if (entityIn.hasCustomName() && "MokkaHornisse48".equals(entityIn.getName().getUnformattedComponentText())) {
			int i1 = 10;
			int i = entityIn.ticksExisted / 10 + entityIn.getEntityId();
			int j = DyeColor.values().length;
			int k = i % j;
			int l = (i + 1) % j;
			float f3 = ((float)(entityIn.ticksExisted % 10) + partialTicks) / 10.0F;
			float[] afloat1 = SheepEntity.getDyeRgb(DyeColor.byId(k));
			float[] afloat2 = SheepEntity.getDyeRgb(DyeColor.byId(l));
			red = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
			green = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
			blue = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
			packedLightIn = 250;
		}
		this.render(matrixStackIn,bufferIn,packedLightIn,packedOverlayIn,red,green,blue,alpha);
	}

}